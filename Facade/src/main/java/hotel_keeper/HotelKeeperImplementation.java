package hotel_keeper;

import Classes.AmbosMenu;
import Classes.NoVegMenu;
import Classes.VegMenu;
import hotelmenu.Ambos;
import hotelmenu.NoVegetariano;
import hotelmenu.Vegetariano;

public class HotelKeeperImplementation implements HotelKeeper{

    @Override
    public VegMenu getVegMenu() {
        Vegetariano V = new Vegetariano();
        VegMenu vegMenu = (VegMenu) V.getMenu();
        return vegMenu;
    }

    @Override
    public NoVegMenu getNoVegMenu() {
        NoVegetariano NV = new NoVegetariano();
        NoVegMenu noVegMenu = (NoVegMenu) NV.getMenu();
        return noVegMenu;
    }

    @Override
    public AmbosMenu getAmbosMenu() {
        Ambos A = new Ambos();
        AmbosMenu ambosMenu = (AmbosMenu) A.getMenu();
        return ambosMenu;
    }
}
