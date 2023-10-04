public class main {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("1st order: " + pizza1.getName());

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("2nd order: " + pizza2.getName());
    }
}
