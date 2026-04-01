import Classes.AmbosMenu;
import Classes.NoVegMenu;
import Classes.VegMenu;
import hotel_keeper.HotelKeeper;
import hotel_keeper.HotelKeeperImplementation;

/*
* Un hotel tiene varios restaurantes, donde cada restaurante tiene un menu diferente.
* Uno es un restaurante vegetariano, otro es un restaurante no vegetariano y el ultimo es un restaurante que tiene ambos tipos de comida.
* El hotel tiene un encargado que se encarga de proporcionar el menu de cada restaurante a los
* clientes que lo soliciten. El cliente puede solicitar un menu especifico al encargado que es el conocerdor,
* y este ultimo debe proporcionar el menu correspondiente
*
* */

public class Cliente {
    public static void main (){
        HotelKeeper keeper = new HotelKeeperImplementation();

        VegMenu vegMenu = keeper.getVegMenu();
        NoVegMenu noVegMenu = keeper.getNoVegMenu();
        AmbosMenu ambosMenu = keeper.getAmbosMenu();

        System.out.println("Menu Vegetariano:");
        vegMenu.getMenu();

        System.out.println("Menu No Vegetariano:");
        noVegMenu.getMenu();

        System.out.println("Menu Ambos:");
        ambosMenu.getMenu();

    }
}
