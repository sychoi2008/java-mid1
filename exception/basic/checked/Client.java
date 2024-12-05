package exception.basic.checked;

public class Client {
    // 이 메서드를 호출하면 예외가 터짐 -> 예외를 던짐 "나 이 예외를 해결 못해. 던져야겠어"
    public void call() throws MyCheckedException{
        // 문제 상황이 발생
        // 그래서 예외를 발생 시켜야겠어
        // 하지만 나는 해결 못하니까 밖으로 던질거임
        throw new MyCheckedException("ex");
    }
}
