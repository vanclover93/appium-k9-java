package lab_06;

import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        int guessingTime = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please your password: ");
            String guessPassword = scanner.nextLine();

            if (guessPassword.equals(myPassword)){
                System.out.println("It's correct!");
                break;
            } else {
                System.out.println("It's wrong password. Try again!");
            }
            guessingTime++;
        } while (guessingTime < 3);
        System.out.println("See you again");
    }
}
