import java.util.*;

public class RecipeActions {
    private List<Recipe> recipeList = new ArrayList<>();

    // Method to add a recipe
    public void addRecipe(String name, List<String> ingredients, String instructions) {
        Recipe newRecipe = new Recipe(name, ingredients, instructions);
        recipeList.add(newRecipe);
        System.out.println("Recipe added successfully.");
    }

    // Method to print all recipes
    public void printAllRecipes() {
        if (recipeList.isEmpty()) {
            System.out.println("No recipes found.");
            return;
        }
        System.out.println("\nAll Recipes:");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }

    // Method to remove a recipe
    public boolean removeRecipe(String name) {
        Iterator<Recipe> iterator = recipeList.iterator();
        while (iterator.hasNext()) {
            Recipe recipe = iterator.next();
            if (recipe.getRecipeName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Recipe removed successfully.");
                return true;
            }
        }
        System.out.println("Recipe not found.");
        return false;
    }

    // Method to find a recipe (optional, for additional functionality)
    public Recipe findRecipe(String name) {
        for (Recipe recipe : recipeList) {
            if (recipe.getRecipeName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }
}
