package lab_2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height is: ");
        float inputHeight = scanner.nextFloat();
        System.out.printf("Your height is: %.2f m\n", inputHeight);

        System.out.print("Please input your weight is: ");
        float inputWeight = scanner.nextFloat();
        System.out.printf("Your weight is: %.0f kg\n", inputWeight);

        float bmi = inputWeight/(inputHeight*2);
        System.out.printf("Your bmi is: %.1f\n", bmi);

        if(bmi <= 18.5){
            System.out.println("=> You need to increase weight");
        } else if (bmi <= 24.9){
            System.out.println("=> You are perfect");
        } else {
            System.out.println("=> You need to decrease weight");
        }
    }
}
