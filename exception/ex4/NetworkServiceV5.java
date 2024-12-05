package exception.ex4;


// 전체적인 흐름을 관리
public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data); // 추가
            client.connect(); // 여기서 예외가 발생하면
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: "+e.getMessage());
            throw e;
        }

    }
}
