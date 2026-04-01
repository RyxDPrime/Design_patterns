package hotelmenu;

import Classes.Menus;
import Classes.NoVegMenu;

public class NoVegetariano implements hotel{
    @Override
    public Menus getMenu() {
        NoVegMenu NVMenu = new NoVegMenu();
        return  NVMenu;
    }
}
