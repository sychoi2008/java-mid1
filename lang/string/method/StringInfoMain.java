package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, java!";
        System.out.println("String length : "+str.length());
        System.out.println("String is empty : "+str.isEmpty());
        System.out.println("String is empty or blank? : "+str.isBlank());
        System.out.println("String is empty or blank? : "+"            ".isBlank());

        char c = str.charAt(7);
        System.out.println("Index no.7 : "+c);

    }
}
