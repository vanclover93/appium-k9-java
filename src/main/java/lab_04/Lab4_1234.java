import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4_1234 {

    public static void main(String[] args) {
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your option: ");
        int option = scanner.nextInt();

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(5);
        arrList.add(7);
        arrList.add(10);
        arrList.add(15);

        switch (option){
            case 1:
                arrList.add(19);
                System.out.println("New list:" +arrList);
                break;

            case 2:
                System.out.println("List is" + arrList);
                break;

            case 3:
                int max = arrList.get(0);
                for (int index = 0; index < arrList.size(); index++) {
                    if(arrList.get(index) > max){
                        max = arrList.get(index);
                    }
                }
                System.out.printf("Maximum number is: %d", max);
                break;

            case 4:
                int min = arrList.get(0);
                for (int index = 0; index < arrList.size(); index++) {
                    if(arrList.get(index) < min){
                        min = arrList.get(index);
                    }
                }
                System.out.printf("Minimum number is: %d", min);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
