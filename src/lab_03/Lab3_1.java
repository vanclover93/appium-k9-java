package lab_03;

public class Lab3_1 {

    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        int arrayLenghth = intArr.length;
        int isOdd = 0;
        int isEven = 0;

        for (int i = 0; i < arrayLenghth; i++) {

            if(intArr[i]%2==1){
                isOdd = isOdd +1;
            }
            if(intArr[i]%2==0){
                isEven = isEven +1;
            }
        }
        System.out.printf("Odd numbers is: %d\n",isOdd);
        System.out.printf("Even numbers is: %d\n",isEven);
    }
}

