package exception.ex3.exception;

// 연결 실패시 발생하는 예외
public class ConnectExceptionV3 extends NetworkClientExceptionV3{
    private final String address; // 연결 실패한 서버 주소

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
