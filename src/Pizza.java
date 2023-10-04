import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + " dough...");
        System.out.println("Adding " + sauce + " sauce...");
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println(topping + " topping");
        }
    }

    void bake() {
        System.out.println("Baking the pizza for 25 minutes at 200º");
    }

    void cut() {
        System.out.println("Cutting the pizza into 6 diagonal slices");
    }

    void box() {
        System.out.println("Placing the pizza in to-go box");
    }

    public String getName() {
        return name;
    }
}
