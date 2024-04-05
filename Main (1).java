import java.util.*;

public class Main{
  public static void main(String[] args) {
    System.out.println("You go hunting in the forest. How big is your backpack?");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows in your backpack: ");
    int rows = input.nextInt();
    System.out.print("Enter the number of columns in your backpack: ");
    int cols = input.nextInt();

    Backpack backpack = new Backpack(rows, cols);
    backpack.fillBackpack();
    
    if (backpack.hasWater()){
      System.out.println("You have water in your backpack. You survive");
    }else{
      System.out.println("You do not have water in your backpack. You do not survive");
  }
}
}