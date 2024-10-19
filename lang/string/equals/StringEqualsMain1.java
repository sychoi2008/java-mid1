package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String () == : "+(str1 == str2));
        System.out.println("new String () equals : "+ (str1.equals(str2)));

        // 리터럴
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("literal == : "+(str3 == str4));
        System.out.println("literal equals : "+(str3.equals(str4)));

    }
}
