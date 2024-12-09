import java.util.ArrayList;
import java.util.Scanner;

// Recipe Class
class Recipe {
    private String name;
    private String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Recipe Name: " + name + "\nDescription: " + description;
    }
}

// Main Class
public class RecipeManager {
    private ArrayList<Recipe> recipeList = new ArrayList<>();

    // Add Recipe
    public void addRecipe(String name, String description) {
        recipeList.add(new Recipe(name, description));
        System.out.println("Recipe added successfully!");
    }

    // Remove Recipe
    public void removeRecipe(String name) {
        Recipe recipeToRemove = null;
        for (Recipe recipe : recipeList) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                recipeToRemove = recipe;
                break;
            }
        }
        if (recipeToRemove != null) {
            recipeList.remove(recipeToRemove);
            System.out.println("Recipe removed successfully!");
        } else {
            System.out.println("Recipe not found.");
        }
    }

    // Display Recipes
    public void displayRecipes() {
        if (recipeList.isEmpty()) {
            System.out.println("No recipes to display.");
        } else {
            System.out.println("Recipes:");
            for (Recipe recipe : recipeList) {
                System.out.println("-----------------------");
                System.out.println(recipe);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nRecipe Manager");
            System.out.println("1. Add Recipe");
            System.out.println("2. Remove Recipe");
            System.out.println("3. Display Recipes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter recipe description: ");
                    String description = scanner.nextLine();
                    manager.addRecipe(name, description);
                    break;
                case 2:
                    System.out.print("Enter the name of the recipe to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeRecipe(removeName);
                    break;
                case 3:
                    manager.displayRecipes();
                    break;
                case 4:
                    System.out.println("Exiting Recipe Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
