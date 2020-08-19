import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.print("What is your first name?:  ");
    fname = keyboard.nextLine();

    System.out.print("What is your last name?:  ");
    lname = keyboard.nextLine();

    System.out.print("What is your favorite animal?:  ");
    favoriteAnimal = keyboard.nextLine();

    System.out.print("What is your favorite food?:  ");
    favoriteFood = keyboard.nextLine();

    System.out.print("What is your favorite song?:  ");
    favoriteSong = keyboard.nextLine();

    System.out.println();
    System.out.println("Good day," + " " + fname + " " + lname);
    System.out.println("The" + " " + favoriteAnimal + " is a cool animal");
    System.out.println(favoriteFood + " are delicious :3");
    System.out.println(favoriteSong + " is a good song");
    System.out.println("Bye" + " " + fname);


  }
}
