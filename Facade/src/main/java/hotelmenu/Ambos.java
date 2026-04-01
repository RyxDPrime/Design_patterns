package hotelmenu;

import Classes.AmbosMenu;
import Classes.Menus;

public class Ambos implements hotel{
    @Override
    public Menus getMenu() {
        AmbosMenu ambosMenu = new AmbosMenu();
        return ambosMenu;
    }
}
