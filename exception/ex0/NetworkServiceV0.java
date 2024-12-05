package exception.ex0;

// 전체적인 흐름을 관리
public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
