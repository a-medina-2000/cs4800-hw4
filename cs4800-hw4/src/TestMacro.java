import java.util.Scanner;

public class TestMacro {
    public static void main(String[] args) {
        Customer customerOne = new Customer();
        Customer customerTwo = new Customer();
        Customer customerThree = new Customer();
        Customer customerFour = new Customer();
        Customer customerFive= new Customer();
        Customer customerSix = new Customer();


        customerOne.setCustomerName(createCustomerName());
        showDietPlans();
        customerOne.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerOne);

        customerTwo.setCustomerName(createCustomerName());
        showDietPlans();
        customerTwo.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerTwo);

        customerThree.setCustomerName(createCustomerName());
        showDietPlans();
        customerThree.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerThree);

        customerFour.setCustomerName(createCustomerName());
        showDietPlans();
        customerFour.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerFour);

        customerFive.setCustomerName(createCustomerName());
        showDietPlans();
        customerFive.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerFive);

        customerSix.setCustomerName(createCustomerName());
        showDietPlans();
        customerSix.setCustomerDietPlan(createCustomerDietPlan());

        mealPlan(customerSix);
    }

    public static void showDietPlans() {
        System.out.println("Diet Plans: None, Paleo, Vegan, Nut Allergy");
    }

    public static String createCustomerName() {
        Scanner reader = new Scanner(System.in);
        String customerName;

        System.out.print("Enter customer name: ");
        customerName = reader.nextLine();
        return customerName;
    }

    public static String createCustomerDietPlan() {
        Scanner reader = new Scanner(System.in);
        String dietPlan;

        System.out.print("Enter diet plan: ");
        dietPlan = reader.nextLine();
        return dietPlan;
    }

    public static void mealPlan(Customer customer) {

        CarbsFactory carbFactory = CarbsFactory.getInstance();
        ProteinsFactory proteinFactory = ProteinsFactory.getInstance();
        FatsFactory fatFactory =  FatsFactory.getInstance();

        CarbsDisplay carbsDisplay = new CarbsDisplay();
        ProteinsDisplay proteinsDisplay = new ProteinsDisplay();
        FatsDisplay fatsDisplay = new FatsDisplay();

        switch(customer.getCustomerDietPlan()) {
            case "Paleo" :{
                Nutrient paleoCarbs = carbFactory.createPaleoNutrient();
                Nutrient paleoProteins = proteinFactory.createPaleoNutrient();
                Nutrient paleoFats = fatFactory.createPaleoNutrient();

                carbsDisplay.displayNutrient(paleoCarbs.nutrientsGroup());
                proteinsDisplay.displayNutrient(paleoProteins.nutrientsGroup());
                fatsDisplay.displayNutrient(paleoFats.nutrientsGroup());
                break;
            }
            case "Vegan" :{
                Nutrient veganCarbs = carbFactory.createVeganNutrient();
                Nutrient veganProteins = proteinFactory.createVeganNutrient();
                Nutrient veganFats = fatFactory.createVeganNutrient();

                carbsDisplay.displayNutrient(veganCarbs.nutrientsGroup());
                proteinsDisplay.displayNutrient(veganProteins.nutrientsGroup());
                fatsDisplay.displayNutrient(veganFats.nutrientsGroup());
                break;
            }
            case "Nut Allergy" :{
                Nutrient nutAllergyCarbs = carbFactory.createNutAllergyNutrient();
                Nutrient nutAllergyProteins = proteinFactory.createNutAllergyNutrient();
                Nutrient nutAllergyFats = fatFactory.createNutAllergyNutrient();

                carbsDisplay.displayNutrient(nutAllergyCarbs.nutrientsGroup());
                proteinsDisplay.displayNutrient(nutAllergyProteins.nutrientsGroup());
                fatsDisplay.displayNutrient(nutAllergyFats.nutrientsGroup());
                break;
            }
            default :{
                Nutrient carbs = carbFactory.createNutrient();
                Nutrient protein = proteinFactory.createNutrient();
                Nutrient fats = fatFactory.createNutrient();

                carbsDisplay.displayNutrient(carbs.nutrientsGroup());
                proteinsDisplay.displayNutrient(protein.nutrientsGroup());
                fatsDisplay.displayNutrient(fats.nutrientsGroup());
                break;
            }
        }
    }

}
