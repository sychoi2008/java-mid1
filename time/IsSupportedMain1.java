package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 년, 월, 일 만 있는데
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 초를 꺼내 달라는 의미
        System.out.println("minute = " + minute);
    }
}
