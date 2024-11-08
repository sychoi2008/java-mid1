package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf
        String numString = String.valueOf(num);
        System.out.println("number String value : "+numString);

        String boolString = String.valueOf(bool);
        System.out.println("boolString value : "+boolString);

        String objString = String.valueOf(obj);
        System.out.println("objString value : "+objString);

        String numString2 = "" + num;
        System.out.println("blank String + num : "+numString2);

        //toCharArray 메서드
        char [] strCharArray = str.toCharArray();
        System.out.println("string to char Array : "+strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }


    }
}
