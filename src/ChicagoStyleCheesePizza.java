public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style deep dish cheese pizza";
        dough = "Extra thick crust";
        sauce = "Plum tomato";

        toppings.add("Shredded mozzarella cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
