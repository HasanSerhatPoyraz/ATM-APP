package Cihaz;

public class SicaklikAlgilayiciIslemler implements ISicaklikAlgilayiciModul{
    private ISicaklikAlgilayiciModul sicaklikAlgilayiciModul;

    public SicaklikAlgilayiciIslemler(ISicaklikAlgilayiciModul sicaklikAlgilayiciModul) {
        this.sicaklikAlgilayiciModul=sicaklikAlgilayiciModul;
    }
    public int sicaklikGetir(){
        return sicaklikAlgilayiciModul.sicaklikGetir();
    }
}
