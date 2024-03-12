import java.util.ArrayList;

public class Pizza {
    private String pizzaChain;
    private ArrayList<String> toppings;
    private String pizzaSize;

    private Pizza(PizzaBuilder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.toppings = builder.toppings;
        this.pizzaSize = builder.pizzaSize;
    }

    public void setPizzaChain(String chain) {
        this.pizzaChain = chain;
    }
    public void setToppings(ArrayList<String> pizzaToppings) {
        this.toppings = pizzaToppings;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public void setPizzaSize(String size) {
        this.pizzaSize = size;
    }

    public String getPizzaChain() {
        return pizzaChain;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public static class PizzaBuilder {
        private String pizzaChain;
        private ArrayList<String> toppings;
        private String pizzaSize;

        public PizzaBuilder pizzaChain(String pizzaChain) {
            this.pizzaChain = pizzaChain;
            return this;
        }

        public PizzaBuilder toppings(ArrayList<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder pizzaSize(String pizzaSize) {
            this.pizzaSize = pizzaSize;
            return this;
        }

        public Pizza build() {
            if(pizzaSize == null) {
                throw new IllegalStateException("Need pizza size.");
            }
            return new Pizza(this);
        }
    }

    public void eat() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Pizza Size: " + pizzaSize);
        System.out.println("Pizza Toppings: " + toppings);
    }
}
