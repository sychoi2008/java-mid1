package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드
    public void callCatch() {
        try {
            client.call(); // 예외 발생 -> Client에서 예외가 날라옴 -> 예외를 잡아서 내가 해결하고 정상 흐름으로 돌림
        } catch (MyCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = "+e.getMessage());
            // 정상 흐름으로 바뀜
        }
        System.out.println("정상 흐름");

    }


    // 체크 예외를 밖으로 던지는 코드. throws 예외를 메서드에 필수로 선언해야 한다.
    public void catchThrow() throws MyCheckedException{
        client.call(); // 예외가 올라왔지만 해결 못해! 밖으로 던져버림
    }
}
