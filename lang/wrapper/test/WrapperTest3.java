package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.valueOf(str); // 문자열을 Integer 객체로 변환 <-> parseInt는 기본형 return
        int intValue = integer1.intValue();
        Integer integer2 = Integer.valueOf(intValue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
