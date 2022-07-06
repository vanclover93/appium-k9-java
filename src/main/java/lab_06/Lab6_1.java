package lab_06;

public class Lab6_1 {

    public static void main(String[] args) {
        String input = "2hrs and 5minutes";
        String hours = input.substring(0,1);
        String minutes = input.substring(9,10);

        int h = Integer.valueOf(hours);
        int m = Integer.valueOf(minutes);

        int c = h*60 +m;
        System.out.printf("Tổng số phút là: %d\n",c);
    }
}
