package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("Seoul");

        MemberV1 memberA = new MemberV1("User A", address);
        MemberV1 memberB = new MemberV1("User B", address);

        // 모두 처음에는 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 B의 주소를 부산으로 변경
        memberB.getAddress().setValue("Busan");
        System.out.println("Busan -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
