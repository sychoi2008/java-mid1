package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int [] lottoNumbers;
    private int count; // isUnique를 체크할 때에도 배열에 숫자가 얼마나 들어가 있는지 체크할 수 있는 기준이 됨


    public int [] generate() {
        lottoNumbers = new int [6];
        count = 0;

        while(count < 6) {
            // 1부터 45사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if(isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }

        }
        return lottoNumbers;

    }

    // 중복체크
    private boolean isUnique(int number) {
        for(int i=0; i<count; i++) {
            if(lottoNumbers[i] == number) return false;
        }
        return true;
    }



}
