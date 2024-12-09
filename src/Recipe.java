import java.util.*;

public class Recipe {
    private String recipeName;
    private String recipeInstructions;
    private List<String> ingredients;

    /**
     *
     * @param name
     * @param ingredient
     * @param instructions
     */
    public Recipe(String name, List<String> ingredient, String instructions){
        this.recipeName = name;
        this.ingredients = ingredient;
        this.recipeInstructions = instructions;
    }

    /**
     *
     * @return
     */
    public String getRecipeName(){
        return recipeName;
    }

    /**
     *
     * @return
     */
    public List<String> getIngredients(){
        return ingredients;
    }

    /**
     *
     * @return
     */
    public String getRecipeInstructions(){
        return recipeInstructions;
    }

}

