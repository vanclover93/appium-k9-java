package lab_03;

import java.util.Arrays;

public class Lab3_3 {

    public static void main(String[] args) {
        int [] intArr = {12,34,1,16,28};
        int arrayLength = intArr.length;

        int x= 0;
        for(int i = 0; i < arrayLength - 1; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (intArr[i] > intArr[j]) {
                    x = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}

