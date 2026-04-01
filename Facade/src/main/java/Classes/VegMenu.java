package Classes;

public class VegMenu extends Menus{
    @Override
    public void showMenu() {
        System.out.println("Menu Vegetariano:");
        System.out.println("- Ensalada de quinoa con vegetales frescos");
        System.out.println("- Tacos de champiñones con salsa de aguacate");
        System.out.println("- Lasaña de verduras con queso vegano");
        System.out.println("- Curry de garbanzos con arroz integral");
        System.out.println("- Postre: Mousse de chocolate vegano");
    }

    @Override
    public void getMenu() {
        System.out.println("Obteniendo el menu vegetariano...");
    }

}
