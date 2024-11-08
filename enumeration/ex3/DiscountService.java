package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // static 값이라서 ClassGrade 인스턴스 생성없이 사용 가능
        if(grade == BASIC) discountPercent = 10;
        else if(grade == GOLD) discountPercent = 20;
        else if(grade == DIAMOND) discountPercent = 30;
        else System.out.println("discount X");


        return price * discountPercent/100;
    }
}
