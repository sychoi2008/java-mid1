package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("Index 7 sub String: "+str.substring(7));
        System.out.println("Index 7~12 subString: "+str.substring(7,12));

        System.out.println("substring concat: "+str.concat("!!!"));

        System.out.println("'Java' -> 'World': "+str.replace("Java", "World"));
        System.out.println("first Java -> World: "+str.replaceFirst("Java", "World"));

    }
}
