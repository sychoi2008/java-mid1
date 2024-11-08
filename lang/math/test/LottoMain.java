package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] numbers = generator.generate();
        System.out.print("Lotto number: ");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
