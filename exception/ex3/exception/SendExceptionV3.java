package exception.ex3.exception;

// 전송 실패시 발생하는 예외
public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
