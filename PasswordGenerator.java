/*
A program to generate passwords of user specified length.
Passwords can include any character with ascii value from 
33 to 126
*/

import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many passwords would you like to generate?");
    int n = input.nextInt();
    System.out.println("How long would you like the passwords to be?");
    int l = input.nextInt();

    generatePasswords(n, l);

    input.close();
    System.exit(0);
  }
    
  // Generate Passwords
  public static void generatePasswords(int n, int length) {
    java.util.Random r = new java.util.Random();
    while (n > 0) {
      String password = "";
      for (int i = 0; i < length; i++) {
        password += ((char) ('!' + r.nextInt(93)));
      }
    System.out.println(password);
    n--;
    }
  }
}
