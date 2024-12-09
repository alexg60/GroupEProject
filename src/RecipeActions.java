import java.util.*;

public class RecipeActions {
    private List<Recipe> recipeList = new ArrayList<>();

    /**
     *
     * @param recipe
     */
    // Method to add a recipe using a Recipe object
    public void addRecipe(Recipe recipe) {
        if (findRecipe(recipe.getRecipeName()) != null) {
            System.out.println("Recipe with this name already exists. Consider updating it instead.");
            return;
        }
        recipeList.add(recipe);
        System.out.println("Recipe added successfully.");
    }

    // Method to print all recipes
    public void printAllRecipes() {
        if (recipeList.isEmpty()) {
            System.out.println("No recipes found.");
            return;
        }
        for (Recipe recipe : recipeList) {
            System.out.println("Recipe Name: " + recipe.getRecipeName());
            System.out.println("Ingredients: " + recipe.getIngredients());
            System.out.println("Instructions: " + recipe.getRecipeInstructions());
            System.out.println("--------------------------");
        }
    }

    /**
     *
     * @param name
     */
    // Method to remove a recipe
    public void removeRecipe(String name) {
        Recipe recipe = findRecipe(name);
        if (recipe != null) {
            recipeList.remove(recipe);
            System.out.println("Recipe removed successfully.");
        } else {
            System.out.println("Recipe not found.");
        }
    }

    /**
     *
     * @param name
     * @return
     */
    // Helper method to find a recipe by name
    private Recipe findRecipe(String name) {
        for (Recipe recipe : recipeList) {
            if (recipe.getRecipeName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
    }
}
