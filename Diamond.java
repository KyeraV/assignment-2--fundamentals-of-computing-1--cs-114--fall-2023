public class Diamond {
  public static void main(String[] args) {

    int j, y, char;

    Scanner input = new Scanner (System.in);
    System.out.println("enter a number");

    for(j = 0; j <=char; j++) {
      for(y = 1; y <= char - j; y++) {
        System.out.print("");
      }
      for(y = 1; y <= 2*j-1; Y++) {
        System.out.print("x");
      }
      System.out.printlin("");
    }

    for(j = char - 1; j >= 1; j--) {
      for(y = 1; y <= char - j; y++) {
        System.out.print("");
      }
      for(y = 1; y <= 2*j-1; y++) {
        Sytem.out.print(" *");
      }
      System.out.println("")
    }
  }

}
