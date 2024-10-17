package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "instance information : " + obj.toString();
        System.out.println(string);
    }
}
