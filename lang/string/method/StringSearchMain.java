package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("Does String contain 'Java': "+str.contains("Java"));
        System.out.println("'Java''s first index: "+str.indexOf("Java"));
        System.out.println("Index 10 ~ 'Java''s index: "+str.indexOf("Java", 10));
        System.out.println("'Java''s final index: "+str.lastIndexOf("Java"));
    }
}
