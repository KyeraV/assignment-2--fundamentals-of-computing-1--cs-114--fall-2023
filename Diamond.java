import java.util.Scanner;
/*Prints a diamond shape using asterisks (stars) */

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("enter a number");
    int rows = input.nextInt();
    int size = (rows/2) + 1;
    int b, y, r;
    int space = rows/2;

    if(rows %2 == 0) {
      for(b = 1; b <= space; b++) {
        for(y = 1; y <= space - b; y++) {
          System.out.print(" ");
        }
        for( r = 1; r <= (b*2-1); r++) {
          System.out.print("* ");
          }
          System.out.println();
      }
      for(b = space; b >= 1; b--) {
        for(y = 1; y <= space - b; y++) {
          System.out.print(" ");
        }
        for(r = 1; r <= (b*2-1); r++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    } else{
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
