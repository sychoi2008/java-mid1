package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow(); // 폭탄이 main 밖으로 던져짐 -> 바로 프로그램 종료임
        System.out.println("정상 종료");
    }
}
