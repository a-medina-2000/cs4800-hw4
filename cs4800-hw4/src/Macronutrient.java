import java.util.Arrays;
import java.util.Random;



class CarbsFactory implements Macronutrient {

    private static CarbsFactory instance;
    private CarbsFactory() {}

    public Nutrient createNutrient() {
        return new Carbs();
    }
    public Nutrient createPaleoNutrient() { return new paleoCarbs(); }
    public Nutrient createVeganNutrient() { return new veganCarbs(); }
    public Nutrient createNutAllergyNutrient() { return new nutAllergyCarbs(); }
    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }
}

class ProteinsFactory implements Macronutrient {
    private static ProteinsFactory instance;
    private ProteinsFactory() {}
    public Nutrient createNutrient() {
        return new Proteins();
    }
    public Nutrient createPaleoNutrient() { return new paleoProtein(); }
    public Nutrient createVeganNutrient() { return new veganProtein(); }
    public Nutrient createNutAllergyNutrient() { return new nutAllergyProteins(); }
    public static ProteinsFactory getInstance() {
        if (instance == null) {
            instance = new ProteinsFactory();
        }
        return instance;
    }
}

class FatsFactory implements Macronutrient {
    private static FatsFactory instance;
    public Nutrient createNutrient() {
        return new Fats();
    }
    public Nutrient createPaleoNutrient() { return new paleoFats(); }
    public Nutrient createVeganNutrient() { return new veganFats(); }
    public Nutrient createNutAllergyNutrient() { return new nutAllergyFats(); }
    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }
}

class Carbs implements Nutrient {
    public String[] nutrientsGroup() {
        String[] carbFoods;
        carbFoods = new String[]{"Cheese", "Bread", "Lentils", "Pistachio"};
        int randItem = new Random().nextInt(carbFoods.length);
        return new String[]{carbFoods[randItem]};
    }
}

class Proteins implements Nutrient {
    public String[] nutrientsGroup() {
        String[] proteinFoods;
        proteinFoods = new String[]{"Fish", "Chicken", "Beef", "Tofu"};
        int randItem = new Random().nextInt(proteinFoods.length);
        return new String[]{proteinFoods[randItem]};
    }
}

class Fats implements Nutrient {
    public String[] nutrientsGroup() {
        String[] fatFoods;
        fatFoods = new String[]{"Avocado", "Sour cream", "Tuna", "Peanuts"};
        int randItem = new Random().nextInt(fatFoods.length);
        return new String[]{fatFoods[randItem]};
    }
}

class paleoCarbs implements Nutrient {
    public String[] nutrientsGroup() {
        String[] paleoCarbs;
        paleoCarbs = new String[]{"Pistachio"};
        return paleoCarbs;
    }
}

class paleoProtein implements Nutrient {
    public String[] nutrientsGroup() {
        String[] paleoProtein;
        paleoProtein = new String[]{"Fish", "Chicken", "Beef"};
        int randItem = new Random().nextInt(paleoProtein.length);
        return new String[]{paleoProtein[randItem]};
    }
}

class paleoFats implements Nutrient {
    public String[] nutrientsGroup() {
        String[] paleoFats;
        paleoFats = new String[]{"Avocado", "Tuna", "Peanuts"};
        int randItem = new Random().nextInt(paleoFats.length);
        return new String[]{paleoFats[randItem]};
    }
}

class veganCarbs implements Nutrient {
    public String[] nutrientsGroup() {
        String[] veganCarbs;
        veganCarbs = new String[]{"Bread", "Lentils", "Pistachio"};
        int randItem = new Random().nextInt(veganCarbs.length);
        return new String[]{veganCarbs[randItem]};
    }
}

class veganProtein implements Nutrient {
    public String[] nutrientsGroup() {
        String[] veganProtein;
        veganProtein = new String[]{"Tofu"};
        return veganProtein;
    }
}

class veganFats implements Nutrient {
    public String[] nutrientsGroup() {
        String[] veganFats;
        veganFats = new String[]{"Avocado", "Peanuts"};
        int randItem = new Random().nextInt(veganFats.length);
        return new String[]{veganFats[randItem]};
    }
}

class nutAllergyCarbs implements Nutrient {
    public String[] nutrientsGroup() {
        String[] nutAllergyCarbs;
        nutAllergyCarbs = new String[]{"Cheese", "Bread", "Lentils"};
        int randItem = new Random().nextInt(nutAllergyCarbs.length);
        return new String[]{nutAllergyCarbs[randItem]};
    }
}

class nutAllergyProteins implements Nutrient {
    public String[] nutrientsGroup() {
        String[] nutAllergyProteins;
        nutAllergyProteins = new String[]{"Fish", "Chicken", "Beef", "Tofu"};
        int randItem = new Random().nextInt(nutAllergyProteins.length);
        return new String[]{nutAllergyProteins[randItem]};
    }
}

class nutAllergyFats implements Nutrient {
    public String[] nutrientsGroup() {
        String[] nutAllergyFats;
        nutAllergyFats = new String[]{"Avocado", "Sour cream", "Tuna"};
        int randItem = new Random().nextInt(nutAllergyFats.length);
        return new String[]{nutAllergyFats[randItem]};
    }
}

class CarbsDisplay implements DisplayNutrient {
    public void displayNutrient(String[] carbFoods) {
        System.out.println(Arrays.toString(carbFoods));
    }
}

class ProteinsDisplay implements DisplayNutrient {
    public void displayNutrient(String[] proteinFoods) {
        System.out.println(Arrays.toString(proteinFoods));
    }
}

class FatsDisplay implements DisplayNutrient {
    public void displayNutrient(String[] fatFoods) {
        System.out.println(Arrays.toString(fatFoods));
    }
}

interface Macronutrient {
    Nutrient createNutrient();
}

interface Nutrient {
    String[] nutrientsGroup();
}

interface DisplayNutrient {
    void displayNutrient(String[] foodGroup);
}