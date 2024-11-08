package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;
        while(true) {
            int i = str.indexOf(key, index);
            if(i == -1) break;
            count++;
            index = i+1;
        }

        System.out.println("count = " + count);
//        int count = 0;
//        int index = str.indexOf(key); // 6
//        while(index >= 0) {
//            index = str.indexOf(key, index+1);
//            count++;
//        }
//        System.out.println("count = " + count);
    }
}
