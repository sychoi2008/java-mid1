package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        // dt에서 무엇을 꺼낼거야? 어떤 필드를 꺼낼거야?
        System.out.println("Year = "+dt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = "+dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = "+dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = "+dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = "+dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = "+dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("Year = "+dt.getYear());
        System.out.println("MONTH_OF_YEAR = "+dt.getMonthValue()); // getMonth : JANUARY, getMonthValue : 숫자 반환
        System.out.println("DAY_OF_MONTH = "+dt.getDayOfMonth()); //
        System.out.println("HOUR_OF_DAY = "+dt.getHour());
        System.out.println("MINUTE_OF_HOUR = "+dt.getMinute());
        System.out.println("SECOND_OF_MINUTE = "+dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY)); // 00시 00분 부터 13시 30분까지 몇 분의 시간이 흘렀는가?
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
