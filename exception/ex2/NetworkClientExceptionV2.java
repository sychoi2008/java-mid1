package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;

    // 예외를 만들 때 에러 코드와 메세지(왜 발생했는지)를 받을 것
    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
