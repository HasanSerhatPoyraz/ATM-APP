package Cihaz;

public class KullaniciBilgileri {
    private String ad;
    private String soyAd;
    private String sifre;
    private boolean yetki;


    public KullaniciBilgileri(kullaniciBuilder builder)
    {
        this.ad=builder.ad;
        this.soyAd=builder.soyAd;
        this.sifre=builder.sifre;
        this.yetki=builder.yetki;
    }

    public String getAd() {
        return ad;
    }
    public String getSoyAd() {
        return soyAd;
    }
    public String getSifre() {
        return sifre;
    }
    public boolean getYetki() {
        return yetki;
    }

    public void setAd(String ad) {
        this.ad=ad;
    }
    public void setSoyAd(String soyAd) {
        this.soyAd=soyAd;
    }
    public void setSifre(String sifre) { this.sifre=sifre; }
    public void setYetki(boolean yetki) {
        this.yetki=yetki;
    }

    public String yetkiliMi(boolean yetkiVar)
    {
        if(yetkiVar==true)
            return "Yetkili Kullanici";
        else
            return "Yetkisiz Kullanici";
    }
    @Override
    public String toString() {
        return //"Kullanici Adi= " + ad +
                //", Kullanici Soyadi= " + soyAd +
                //", Kullanici Sifresi= " + sifre +
               // ", Kullanici Yetkisi= " +
                yetkiliMi(yetki) ;
    }
        //builder deseni
    public static class kullaniciBuilder
    {
        private String ad;
        private String soyAd;
        private String sifre;
        private boolean yetki;


        public kullaniciBuilder(String ad,String sifre,boolean yetki)
        {
            this.ad=ad;
            this.sifre=sifre;
            this.yetki=yetki;
        }

        public kullaniciBuilder soyAd (String soyAd) {
            this.soyAd = soyAd;
            return this;
        }

        public KullaniciBilgileri build() {
            return new KullaniciBilgileri(this);
        }
    }
}
