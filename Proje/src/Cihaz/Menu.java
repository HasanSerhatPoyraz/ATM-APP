package Cihaz;

import database.AkilliCihazPostgreSQL;
import database.DatabaseManager;

import java.util.Scanner;

public class Menu implements IMenu {
    Publisher p = new Publisher();
    SicaklikDatabase s1=new SicaklikDatabase();
    KritikSicaklikDegerlendirme s2=new KritikSicaklikDegerlendirme();


    public void cihazMenusu() {
        p.attach(s1);
        p.attach(s2);
        String eh;
        int secilenIslem;

        IEleyici eleyici=new EleyiciIslemler(new Eleyici());
        ISicaklikAlgilayiciModul sicaklikAlgilayiciModul=new SicaklikAlgilayiciIslemler(new SicaklikAlgilayiciModul());

        do {
            System.out.println("Yapilacak Islem Seciniz:");
            System.out.println("1.Sogutucu Ac");
            System.out.println("2.Sogutucu Kapa");
            System.out.println("3.Sicaklik Goruntule");
            Scanner sc1 = new Scanner(System.in);
            secilenIslem =  Integer.parseInt(sc1.next());
            if(secilenIslem==1)
            {
                eleyici.sogutucuAc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(secilenIslem==2)
            {
                eleyici.sogutucuKapat();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (secilenIslem==3)
            {
                p.notify(String.valueOf(sicaklikAlgilayiciModul.sicaklikGetir()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Hatali Islem");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

                System.out.println("Baska Bir Islem Yapmak Istiyor Musunuz?(e/h)");
                Scanner sc2 = new Scanner(System.in);
                eh = sc2.next();


        } while (eh.equals("e"));

    }
}
