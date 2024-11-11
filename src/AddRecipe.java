import java.util.ArrayList;
import java.util.Scanner;

public class AddRecipe {
    private static Scanner input = new Scanner(System.in);

    public static String inputRecipeName() {
        System.out.print("Enter the recipe name: ");
        return input.nextLine();
    }

    public static double inputServings() {
        System.out.print("Enter the number of servings: ");
        return Double.parseDouble(input.nextLine());
    }

    public static ArrayList<String> inputIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        String ingredient;
        System.out.println("Enter ingredients (type 'quit' when finished): ");

        while (true) {
            ingredient = input.nextLine();
            if (ingredient.equalsIgnoreCase("quit")) {
                break;
            }
            ingredients.add(ingredient);
        }
        return ingredients;
    }

    public static ArrayList<String> inputSteps() {
        ArrayList<String> steps = new ArrayList<>();
        String step;
        System.out.println("Enter cooking steps (type 'quit' when finished): ");

        while (true) {
            step = input.nextLine();
            if (step.equalsIgnoreCase("quit")) {
                break;
            }
            steps.add(step);
        }
        return steps;
    }

    public static void displayRecipe(String name, double servings, ArrayList<String> ingredients, ArrayList<String> steps) {
        System.out.println("\nRecipe Name: " + name);
        System.out.println("Servings: " + servings);
        System.out.println("\nIngredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }

        System.out.println("\nSteps: ");
        int stepNum = 1;
        for (String step : steps) {
            System.out.println(stepNum++ + ". " + step);
        }
    }

    public static void main(String[] args) {
        String name = inputRecipeName();
        double servings = inputServings();
        ArrayList<String> ingredients = inputIngredients();
        ArrayList<String> steps = inputSteps();

        displayRecipe(name, servings, ingredients, steps);
    }
}