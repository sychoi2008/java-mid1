package exception.ex1;


// 전체적인 흐름을 관리
public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가


        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> 오류다.
        if (isError(connectResult)) { // 연결을 실패 했으면
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);

        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) { // 실패
                System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success"); // 성공이 아니면 에러니까 true
    }
}
