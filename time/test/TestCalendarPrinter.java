package time.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도 입력 : ");
        int year = scanner.nextInt();

        System.out.println("월 입력 : ");
        int month = scanner.nextInt();

        printCalendar(year, month);

    }

    private static void printCalendar(int year, int month) {
        LocalDate start = LocalDate.of(year, month, 1);

        System.out.println(ChronoField.DAY_OF_WEEK.range());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE");
        String str = start.format(formatter);
        System.out.println(str);
    }
}
