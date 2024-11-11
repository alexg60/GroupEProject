import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Recipe Management System");
            System.out.println("1: Add New Recipe");
            System.out.println("2: Remove Recipe");
            System.out.println("3: View All Recipes");
            System.out.println("4: Quit");
            System.out.print("Enter Choice: ");
            int input = scan.nextInt();

            switch (input){
                case 1:
                    //addRecipe();
                    break;
                case 2:
                    //removeRecipe();
                    break;
                case 3:
                    //viewRecipes();
                    break;
                case 4:
                    cont = false;
                    System.out.println("Quiting the Recipe Management System");
                    break;
                default:
                    System.out.println("Error: Invalid Input, Try again");
            }
        }while(cont == true);

    }
}