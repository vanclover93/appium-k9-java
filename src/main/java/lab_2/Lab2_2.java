package lab_2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int inputNumber = scanner.nextInt();
        System.out.printf("Your input number is: %d\n", inputNumber);
        int x = inputNumber%2;

        if(x == 1) {
            System.out.println("It is an odd number");
        } else {
            System.out.println("It is an even number");
        }
    }
}
