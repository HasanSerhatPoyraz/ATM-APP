package Cihaz;

import java.util.Random;
public class SicaklikAlgilayiciModul implements ISicaklikAlgilayiciModul{
    static int sicaklikDegeri=0;
    public int sicaklikGetir(){

        Random r=new Random(); //random sınıfı
        while(sicaklikDegeri<20){
            sicaklikDegeri=r.nextInt(35);
        }
        System.out.println("Sicaklik Degeri: "+sicaklikDegeri);
    return sicaklikDegeri;
    }


}
