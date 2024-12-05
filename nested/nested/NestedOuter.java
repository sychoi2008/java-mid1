package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        // 같은 하나의 클래스에 있다고 해도 static은 메서드 영역에 인스턴스 변수는 힙 영역에 생성
        private int nestedInstanceValue = 1;
        public void print() {
            // 자신의 멤버에는 당연히 접근할 수 있다
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다 -> static 클래스가 인스턴스 변수에 접근 불가능. 인스턴스를 생성하지 않았는데!
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }

}
