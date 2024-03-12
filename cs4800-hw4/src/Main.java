import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String chosenChain = "", selection = "", SENTINEL = "-1";
        ArrayList<String> chosenToppings = new ArrayList<>();
        String[] possibleToppings = {"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
               "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil",
                "Beef", "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"};

        System.out.println("What chain would you like to order from?");
        chosenChain = reader.nextLine();


        System.out.println("Choose toppings from this list (-1 to quit): " + Arrays.toString(possibleToppings));
        while(true) {
            selection = reader.nextLine();
            if(selection.equals(SENTINEL)) {
                break;
            } else {
                chosenToppings.add(selection);
            }
        }

        Pizza pizzaSmall = Pizza.builder()
                .pizzaChain(chosenChain)
                .pizzaSize("Small")
                .toppings(chosenToppings)
                .build();
        pizzaSmall.eat();

        System.out.println("What chain would you like to order from?");
        chosenChain = reader.nextLine();
        chosenToppings.clear();

        System.out.println("Choose toppings from this list (-1 to quit): " + Arrays.toString(possibleToppings));
        while(true) {
            selection = reader.nextLine();
            if(selection.equals(SENTINEL)) {
                break;
            } else {
                chosenToppings.add(selection);
            }
        }

        Pizza pizzaMedium = Pizza.builder()
                .pizzaChain(chosenChain)
                .pizzaSize("Medium")
                .toppings(chosenToppings)
                .build();
        pizzaMedium.eat();

        System.out.println("What chain would you like to order from?");
        chosenChain = reader.nextLine();
        chosenToppings.clear();

        System.out.println("Choose toppings from this list (-1 to quit): " + Arrays.toString(possibleToppings));
        while(true) {
            selection = reader.nextLine();
            if(selection.equals(SENTINEL)) {
                break;
            } else {
                chosenToppings.add(selection);
            }
        }

        Pizza pizzaLarge = Pizza.builder()
                .pizzaChain(chosenChain)
                .pizzaSize("Large")
                .toppings(chosenToppings)
                .build();
        pizzaLarge.eat();
    }
}
