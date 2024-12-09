import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
        // Create an instance of RecipeActions
        RecipeActions recipeActions = new RecipeActions();
        // Create Recipe objects
        Recipe pancakeRecipe = new Recipe("Pancakes",
                Arrays.asList("Flour", "Milk", "Eggs", "Sugar", "Salt"),
                "Mix all ingredients and cook on a skillet."
        );

        Recipe omeletteRecipe = new Recipe(
                "Omelette",
                Arrays.asList("Eggs", "Milk", "Salt", "Pepper"),
                "Whisk eggs with milk, add salt and pepper, and cook in a pan."
        );

        // Add recipes to RecipeActions
        recipeActions.addRecipe(pancakeRecipe);
        recipeActions.addRecipe(omeletteRecipe);
        do {
            System.out.println("\nRecipe Management System");
            System.out.println("1: Add New Recipe");
            System.out.println("2: Remove Recipe");
            System.out.println("3: View All Recipes");
            System.out.println("4: Quit");
            System.out.print("Enter Choice: ");
            int input = scan.nextInt();

            switch (input){
                case 1:
                    System.out.println("Enter recipe name: ");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    System.out.println("Enter ingredients (comma-separated): ");
                    String ingredientInput = scan.nextLine();
                    List<String> ingredients = Arrays.asList(ingredientInput.split("\\s*,\\s*"));

                    System.out.print("Enter instructions: ");
                    String instructions = scan.nextLine();

                    Recipe newRecipe = new Recipe(name, ingredients, instructions);
                    recipeActions.addRecipe(newRecipe);
                    break;
                case 2:
                    System.out.print("Enter the name of the recipe to remove: ");
                    String recipeToRemove = scan.nextLine();
                    recipeToRemove = scan.nextLine();
                    recipeActions.removeRecipe(recipeToRemove);
                    break;
                case 3:
                    recipeActions.printAllRecipes();
                    break;
                case 4:
                    cont = false;
                    System.out.println("Quiting the Recipe Management System");
                    break;
                default:
                    System.out.println("Error: Invalid Input, Try again");
            }
        }while(cont == true);
        scan.close();
    }
}
