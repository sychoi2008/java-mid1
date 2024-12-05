package exception.ex4.exception;


// 연결 실패시 발생하는 예외
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    private final String address; // 연결 실패한 서버 주소

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
