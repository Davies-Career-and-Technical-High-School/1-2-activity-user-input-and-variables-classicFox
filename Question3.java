/* Activity 1.2 - Question 3 */

import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        System.out.print("Hi There, what is your name?");
    Scanner scan = new Scanner(System.in);
    String name;

    String adjective;

     name = scan.nextLine();

     System.out.println("what adjective best describes you? ");

     adjective = scan.nextLine();

    System.out.println("my name is  " + name + ". I am " + adjective);

    }
}