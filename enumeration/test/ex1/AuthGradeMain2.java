package enumeration.test.ex1;

import java.io.*;
import java.util.*;


public class AuthGradeMain2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your grade[GUEST, LOGIN, ADMIN]: ");
        String input = scanner.next();

        AuthGrade.valueOf(input.toUpperCase(Locale.ROOT)).getScreen();




    }


}

