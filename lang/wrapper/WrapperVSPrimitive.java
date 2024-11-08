package lang.wrapper;

public class WrapperVSPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i=0; i< iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("primitive type long execution time: "+(endTime - startTime) + "ms");

        // wrapper Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i=0; i< iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("Wrapper type Long execution time: "+(endTime - startTime) + "ms");
    }
}
