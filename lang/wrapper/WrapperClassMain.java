package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        //Integer newInteger = new Integer(10); // new Integer()은 deprecated 예정
        Integer newInteger = Integer.valueOf(10); // -128~127 자주 사용하는 숫자 값 재사용, 불변
        Integer integerObj = Integer.valueOf(10); // -128~127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("Read inner value");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("Compare");
        System.out.println("==: "+(newInteger == integerObj));
        System.out.println("equals: "+(newInteger.equals(newInteger)));


    }
}
