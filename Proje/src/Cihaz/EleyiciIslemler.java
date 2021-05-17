package Cihaz;

public class EleyiciIslemler  implements IEleyici{

    private IEleyici eleyici;

    public EleyiciIslemler(IEleyici eleyici){
        this.eleyici=eleyici;
    }

    public void sogutucuAc(){
         eleyici.sogutucuAc();
    }
    public void sogutucuKapat(){
         eleyici.sogutucuKapat();
    }




}
