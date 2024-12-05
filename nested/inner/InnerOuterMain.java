package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // type : 바깥 클래스명.inner 클래스명 = 바깥 클래스의 인스턴스 명.new inner 클래스
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();


        System.out.println("innerClass = "+inner.getClass());
    }
}
