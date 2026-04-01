package hotelmenu;

import Classes.Menus;
import Classes.VegMenu;

public class Vegetariano implements hotel {
    @Override
    public Menus getMenu() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
