import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner readFromKeyboard = new Scanner(System.in);
    int valueTypedOnKeyboard;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      valueTypedOnKeyboard = readFromKeyboard.nextInt();

      if ( valueTypedOnKeyboard == 1 ){
        System.out.println("Hello Human");
      }
      else if ( valueTypedOnKeyboard == 2 ){
        System.out.println("Apple, Banana, Coconut");
      }
      else if ( valueTypedOnKeyboard == 3 ) {
        System.out.println("Goodbye");
        break;
      }
      else {
        System.out.println("Please choose wisely");
      }

      /*
      Your solution goes here
      */
    }

  readFromKeyboard.close();
  }
}
