import java.util.Scanner;//Need this to import Scanner Class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Creates a scanner object called input that can bu used to take inputs
                                            // from the keyboard
    int num1;
    double num2;
    System.out.println("Please enter a number");
    num1 = input.nextInt();

    System.out.println("You entered " + num1);

    System.out.println("Please enter another number");
    num2 = input.nextDouble();

    System.out.println("You entered " + num2);
  //(),*/%,+-
    System.out.println(2 + 2);
    System.out.println(3-2);
    System.out.println(2 / 2);
    System.out.println(2 * 2);
    System.out.println(9 % 2);
    System.out.println(1/2);
    System.out.println(1.0/2);
    System.out.println(1/(int)2.0);
    System.out.println((double)1/2);

  }
}