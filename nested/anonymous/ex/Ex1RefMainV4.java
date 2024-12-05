package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {


    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }



    public static void main(String[] args) {
        // 익명 클래스는 한번만 사용되니까, 굳이 참조값을 받아서 파라미터로 넘길바에 차라리 파라미터에 직접 사용
        hello(new Process() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });
        hello(new Process() {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
