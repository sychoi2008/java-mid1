package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println(str); // 변하는 부분 : 외부에서 전달받음
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        // 변하는 부분과 변하지 않는 부분을 분리하자
        // 그리고 변하는 부분은 외부에서 주입받자
        hello("Hello Java");
        hello("Hello Spring");
    }
}
