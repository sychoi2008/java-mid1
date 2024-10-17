package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("Busan");
        b = new ImmutableAddress("Busan");
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
