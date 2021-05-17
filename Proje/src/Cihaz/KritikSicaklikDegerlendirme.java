package Cihaz;

public class KritikSicaklikDegerlendirme implements IObserver{
    @Override
    public void update(String sicaklik) {
        System.out.println("Sicaklik Degeri(" + sicaklik+") kritik sicaklik degerlendirme sistemine gonderiliyor...");
    }
}
