package hotel_keeper;

import Classes.AmbosMenu;
import Classes.NoVegMenu;
import Classes.VegMenu;

public interface HotelKeeper {

    public VegMenu getVegMenu();
    public NoVegMenu getNoVegMenu();
    public AmbosMenu getAmbosMenu();
}
