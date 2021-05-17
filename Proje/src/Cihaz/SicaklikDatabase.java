package Cihaz;

public class SicaklikDatabase implements IObserver {
    @Override
    public void update(String sicaklik) {
        System.out.println("Sicaklik Degeri(" + sicaklik+") veritabanina gonderiliyor...");
    }
}
