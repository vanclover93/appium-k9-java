package lab_06;

import java.sql.SQLOutput;

public class Lab6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";

        //Dùng Substring
        System.out.println(myStr.substring(0,3));

        //Dùng Regex
        String output = myStr.replaceAll("[^0-9]","");
        System.out.println(output);

        //Bai 2
        String myStr1 = "12345nabc678";
        String output1 = myStr1.replaceAll("[^0-9]","");
        System.out.println(output1);


    }
}
