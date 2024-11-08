package enumeration.ex2;

public class ClassGrade {
    /*
    처음에는 그냥 static final String으로 하면 되는거 아니야? 했는데 그럴경우는 ex1처럼 discount 함수에 String으로 받아서
    BASIC, GOLD, DIAMOND 이외의 다른 문자열을 받을 수 있다
    따라서 그냥 애초부터 ClassGrade 타입으로 변수들을 만들고 discount 함수의 파라미터도 ClassGrade 타입으로 제한하면
    BASIC, GOLD, DIAMOND 이외의 값은 올 수 없을 것!
     */

    private ClassGrade () {}

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}
