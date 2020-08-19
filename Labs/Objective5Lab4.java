import java.util.Scanner;
public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;

      System.out.println("Please enter a number: ");

      /*
        Your solution goes here
      */
      num = scanner.nextInt();
      if (num % 2 == 0){
        System.out.println(num + " the number is even");

      } else {
        System.out.println(num + " the number is odd");

      }

      scanner.close();
  }
}
