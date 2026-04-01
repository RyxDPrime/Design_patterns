package Classes;

public class NoVegMenu extends Menus {
    @Override
    public void showMenu() {
        System.out.println("Menu no vegetariano:");
        System.out.println("- Filete a la parrilla con pure de papas");
        System.out.println("- Pollo asado con vegetales salteados");
        System.out.println("- Hamburguesa clasica con papas fritas");
        System.out.println("- Pasta carbonara");
        System.out.println("- Postre: Flan de vainilla");
    }
    @Override
    public void getMenu() {
        System.out.println("Obteniendo el menu no vegetariano...");
    }
}

