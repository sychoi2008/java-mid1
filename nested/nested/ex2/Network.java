package nested.nested.ex2;


public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // private으로 막아놨기에 외부에서 이 클래스에 접근할 수 없음
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
