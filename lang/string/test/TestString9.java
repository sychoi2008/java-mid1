package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String [] temp = email.split("@");
        System.out.println("ID: "+temp[0]);
        System.out.println("Domain: "+temp[1]);
    }
}
