package lab_03;

import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99};
        int arrayLength1 = intArr1.length;
        int arrayLength2 = intArr2.length;
        int[] intArr3 = new int[intArr1.length + intArr2.length];
        int arrayLength3 = intArr3.length;

        for (int i = 0; i < intArr1.length + intArr2.length; i++) {
            if (i < intArr1.length) {
                intArr3[i] = intArr1[i];
            } else {
                intArr3[i] = intArr2[i - intArr1.length];
            }
        }
        System.out.printf("Array 3 is: %s\n",Arrays.toString(intArr3));

        int x= 0;
        for(int i = 0; i < arrayLength3 - 1; i++) {
            for (int j = i + 1; j < arrayLength3; j++) {
                if (intArr3[i] > intArr3[j]) {
                    x = intArr3[i];
                    intArr3[i] = intArr3[j];
                    intArr3[j] = x;
                }
            }
        }
        System.out.printf("Sorted array 3 is %s\n",Arrays.toString(intArr3));
    }
}
