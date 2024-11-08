package enumeration.ex2;


public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        // static 값이라서 ClassGrade 인스턴스 생성없이 사용 가능
        if(classGrade == ClassGrade.BASIC) discountPercent = 10;
        else if(classGrade == ClassGrade.GOLD) discountPercent = 20;
        else if(classGrade == ClassGrade.DIAMOND) discountPercent = 30;
        else System.out.println("discount X");


        return price * discountPercent/100;
    }
}
