import java.util.Scanner;
/*Prints a diamond shape using asterisks (stars) */

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("enter a number");
    int rows = input.nextInt();
    int size = (rows+1)/2;
    int b, y, r;
    int space = rows/2;

    if(row s %2==0) {
      for(b = 1; b <= rows / 2; b++) {
        for(y = 1; y <= rows / 2 - 1; y++) {
          System.out.print(" ")
        }
      }
    }else {
      for(b = 1; b <= size; b++) { // top half
        for(y = 1; y <= (size-b); y++) { // whitespaces
          System.out.print(" ");
        }
        for(r = 1; r <= (b*2-1); r++) { //print asterisks (stars)
          System.out.print("*");
        }
       System.out.println();
      }
      for(b = 1; b <= (size-1); b++) { // bottom half
        for(y = 1; y <=b; y++) { // whitespaces
        System.out.print(" ");
        }
        for(r = 1; r <= 2*(size-b)-1; r++) { // Print stersisks (stars)
          System.out.print("*");
        }
       System.out.println();
      }
    }
  }
}
