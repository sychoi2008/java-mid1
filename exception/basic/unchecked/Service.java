package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있다
    public void callCatch() {
        try {
            client.call(); // 폭탄 날라옴
        } catch (MyUncheckedException e) { // 잡아서 정상 로직
            System.out.println("예외 처리, msg = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 자동으로 상위로 넘어간다
    // 체크예외와 다르게 throws 예외 선언을 하지 않아도 된다
    public void callThrow() {
        client.call();

    }
}
