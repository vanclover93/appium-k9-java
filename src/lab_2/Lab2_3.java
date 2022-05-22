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

        float increaseWeight = (18.6f - bmi)*(inputHeight*2);
        float decreaseWeight = (bmi - 25f)*(inputHeight*2);

        if(bmi <= 18.5){
            System.out.printf("=> You need to increase %.0f kg", increaseWeight);
        } else if (bmi <= 24.9){
            System.out.println("=> You are perfect");
        } else {
            System.out.printf("=> You need to decrease %.0f kg", decreaseWeight);
        }
    }
}
