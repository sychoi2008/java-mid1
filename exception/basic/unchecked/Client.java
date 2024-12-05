package exception.basic.unchecked;

public class Client {
    public void call() { // 언체크 예외는 throws 생략 가능
        throw new MyUncheckedException("ex");
    }
}
