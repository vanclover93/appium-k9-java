package lab_03;

public class Lab3_2 {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        int arrayLength = intArr.length;
        int max = 1;
        int min = 1;

        for (int i = 0; i < arrayLength; i++) {
            if(intArr[i]>max){
                max = intArr[i];
            }
            if(intArr[i] < min){
                min = intArr[i];
            }
        }
        System.out.printf("Maximum is: %d\n",max);
        System.out.printf("Minimum is: %d\n",min);
    }
}
