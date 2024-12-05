package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 선언하고 생성함
        // 인터페이스의 구현체를 이름없이 만들면서 그걸 생성함
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
