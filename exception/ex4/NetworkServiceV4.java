package exception.ex4;


// 전체적인 흐름을 관리
public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        try {
            client.connect(); // 여기서 예외가 발생하면
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
