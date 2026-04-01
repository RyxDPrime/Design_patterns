package Classes;

public class AmbosMenu extends Menus{

    @Override
    public void showMenu() {
        System.out.println("Menu Ambos:");
        System.out.println("- Plato 1: Pollo a la parrilla con ensalada");
        System.out.println("- Plato 2: Filete de res con papas fritas");
        System.out.println("- Plato 3: Pasta con salsa de tomate y albóndigas");
        System.out.println("- Plato 4: Ensalada César con pollo a la parrilla");
        System.out.println("- Plato 5: Hamburguesa con queso y papas fritas");
    }

    @Override
    public void getMenu() {
        System.out.println("Obteniendo el menu ambos...");
    }
}
