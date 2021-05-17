package Cihaz;



import database.AkilliCihazPostgreSQL;
import database.DatabaseManager;

import java.util.Locale;
import java.util.Scanner;


public class GirisEkrani {

    String kullaniciAdi;
    String sifre;

    KullaniciBilgileri kullanici;

    //*****akilli cihaza ait veritabanı işlemleri için kullanılacak nesne**************************
    ISirketBilgiSistemi kullaniciDogrula=new DatabaseManager(new AkilliCihazPostgreSQL());
    //*****akilli cihaza ait menu işlemleri için kullanılacak nesne**************************
    IMenu cihazMenusu=new CihazMenu(new Menu());


    public void kullaniciGirisi()
    {
        System.out.println("KULLANICI ADI:");
        Scanner Adi=new Scanner(System.in);
        kullaniciAdi=Adi.next().toLowerCase();


        System.out.println("SIFRE:");
        Scanner password=new Scanner(System.in);
        sifre= password.next();

        kullanici = kullaniciDogrula.kullaniciDogrula(kullaniciAdi,sifre);

        if(kullanici!=null)
        {
            System.out.println(kullanici);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
            System.out.println("Aradığınız Kullanici Bulunamadı");
    }

    public void cihazMenusu()
    {
        if(kullanici!=null){
            if(kullanici.getYetki()==true)
            {
                cihazMenusu.cihazMenusu();
            }
            else
            {
                System.out.println("Yetkisiz Kullanici");
            }
        }

    }

}
