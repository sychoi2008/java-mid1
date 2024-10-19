package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strwithSpace = "      Java Programming ";

        System.out.println("to lower: "+strwithSpace.toLowerCase());
        System.out.println("to upper: "+strwithSpace.toUpperCase());

        System.out.println("remove blank(trim): '"+strwithSpace.trim()+"'");
        System.out.println("remove blank(strip): '"+strwithSpace.strip()+"'");
        System.out.println("remove forehead blank(strip): '"+strwithSpace.stripLeading()+"'");
        System.out.println("remove back blank(strip): '"+strwithSpace.stripTrailing()+"'");

    }
}
