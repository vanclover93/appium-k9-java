package lab_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height is: ");
        float inputHeight = scanner.nextFloat();
        System.out.printf("Your height is: %.2f m\n", inputHeight);

        System.out.print("Please input your weight is: ");
        float inputWeight = scanner.nextFloat();
        System.out.printf("Your weight is: %.0f kg\n", inputWeight);

        float bmi = inputWeight/(inputHeight*2);
        System.out.printf("Your BMI is: %.1f\n", bmi);

        if (bmi <= 18.5) {
            System.out.println("=> You are underweight");
        } else if (bmi <= 24.9){
            System.out.println("=> You are normal weight");
        } else if (bmi <= 29.9){
            System.out.println("=> You are overweight");
        } else {
            System.out.println("=> You are obesity");
        }




    }
}
