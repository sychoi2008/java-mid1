package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            printAuthGrade(grade);
        }
    }

    private static void printAuthGrade(AuthGrade grade) {
        System.out.println("grade="+grade.name()+", level="+grade.getLevel()+", description="+grade.getDescription());
    }
}

