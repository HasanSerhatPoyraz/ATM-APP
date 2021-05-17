package Cihaz;

public class CihazMenu implements IMenu{
    private  IMenu menu;
    public CihazMenu(IMenu menu){
        this.menu=menu;
    }
    public void cihazMenusu(){
        menu.cihazMenusu();
    }
}
