package lab_06;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        boolean isDomain = true;

        System.out.println(url.contains("http"));
        System.out.println(url.contains("https"));
        System.out.println(url.contains(".com"));
        System.out.println(url.contains(".net"));
    }
}
