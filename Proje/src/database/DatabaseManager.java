package database;

import Cihaz.ISirketBilgiSistemi;
import Cihaz.KullaniciBilgileri;

public class DatabaseManager implements ISirketBilgiSistemi {
    private ISirketBilgiSistemi veritabani;

    public  DatabaseManager(ISirketBilgiSistemi veritabani)
    {
       this.veritabani=veritabani;
    }
    public KullaniciBilgileri kullaniciDogrula(String kullaniciAdi, String kullaniciSifre)
    {
        return veritabani.kullaniciDogrula(kullaniciAdi,kullaniciSifre);
    }
}
