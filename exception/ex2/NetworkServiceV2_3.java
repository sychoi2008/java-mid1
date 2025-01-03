package exception.ex2;



// 전체적인 흐름을 관리
public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect(); // 여기서 예외가 발생하면
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) { // 여기서 잡는다
            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메세지 = "+e.getMessage());
        }


    }
}
