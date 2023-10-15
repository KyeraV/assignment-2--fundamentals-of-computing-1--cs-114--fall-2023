import java.util.Scanner;
/*Prints a diamond shaoe using As */

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("enter a number");
    int row = input.nextInt();
    int number = input.nextInt();
    int y, b;

    if(number%2==0) {
      System.out.println("even number");
    }else{
      System.out.println("odd number");
    }

    for(y = 0; y <=row; y++) {
      for(b = 1; b <= row - y; b++) {
        System.out.print(" ");
      }
      for(b = 1; b <= 2*y-1; b++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for(y = row - 1; y >= 1; y--) {
      for(b = 1; b <= row - y; b++) {
        System.out.print(" ");
      }
      for(b = 1; b <= 2*y-1; b++) {
        System.out.print(" *");
      }
      System.out.println(" *");
    }
  }

}
