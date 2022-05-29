package lab_04;

import java.util.ArrayList;
import java.util.List;

public class Lab4_1234 {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        int max = 1;
        int min = 1;

        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(6);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(11);

        for (int index = 0; index < myArrayList.size(); index++) {

            System.out.println(myArrayList.get(index));

            if (myArrayList.get(index) > max) {
                max = myArrayList.get(index);
            }
            if (myArrayList.get(index) < min) {
                min = myArrayList.get(index);
            }
        }
        System.out.printf("Maximum number is: %d\n", max);
        System.out.printf("Minimum number is: %d\n", min);
    }
}

