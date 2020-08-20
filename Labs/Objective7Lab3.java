public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    /*
      Your solution goes here
    */
    while(counter <= 20) {
      /*
      Your solution goes here
      */
      System.out.print(counter + " is ");

      if ( (counter % 2) == 0 ) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
      counter = counter+1;

    }
  }
}
