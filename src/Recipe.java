import java.util.*;

public class Recipe {
    private String recipeName;
    private String recipeInstructions;
    private List<String> ingredients;

    public Recipe(String name, List<String> ingredient, String instructions){
        this.recipeName = name;
        this.ingredients = ingredient;
        this.recipeInstructions = instructions;
    }

    public String getRecipeName(){
        return recipeName;
    }

    public List<String> getIngredients(){
        return ingredients;
    }

    public String getRecipeInstructions(){
        return recipeInstructions;
    }

}


