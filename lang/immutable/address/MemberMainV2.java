package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("Seoul");

        MemberV2 memberA = new MemberV2("User A", address);
        MemberV2 memberB = new MemberV2("User B", address);

        // 모두 처음에는 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 B의 주소를 부산으로 변경
        //memberB.getAddress().setValue("Busan"); // 컴파일 오류
        memberB.setAddress(new ImmutableAddress("Busan"));
        System.out.println("Busan -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);



    }
}
