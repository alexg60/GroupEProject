import java.util.*;

public class RecipeActions {
    private List<Recipe> recipeList = new ArrayList<>();

    // Method to add a recipe
    public void addRecipe(String name, List<String> ingredients, String instructions, String preparationTime, List<String> equipmentNeeded) {
        if (findRecipe(name) != null) {
            System.out.println("Recipe with this name already exists. Consider updating it instead.");
            return;
        }
        Recipe newRecipe = new Recipe(name, ingredients, instructions, preparationTime, equipmentNeeded);
        recipeList.add(newRecipe);
        System.out.println("Recipe added successfully.");
    }

    // Method to print all recipes
    public void printAllRecipes() {
        if (recipeList.isEmpty()) {
            System.out.println("No recipes found.");
            return;
        }
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }

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

    // Method to update a recipe
    public void updateRecipe(String name, List<String> newIngredients, String newInstructions, String newPreparationTime, List<String> newEquipmentNeeded) {
        Recipe recipe = findRecipe(name);
        if (recipe != null) {
            recipe.incrementVersion();
            recipe.setIngredients(newIngredients);
            recipe.setRecipeInstructions(newInstructions);
            recipe.setPreparationTime(newPreparationTime);
            recipe.setEquipmentNeeded(newEquipmentNeeded);
            System.out.println("Recipe updated successfully.");
        } else {
            System.out.println("Recipe not found for update.");
        }
    }

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
