package nested.test.ex1;

public class Library {

    private static class Book {
        // static인 이유 : 내부에서 외부 클래스의 인스턴스 변수들을 사용할 것 같지는 않기 때문에
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }


    private int count; // 현재 넣은 책의 인덱스
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(String title, String author) {
        if(count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }
        books[count++] = new Book(title, author);

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 == ");
        for(int i=0; i<count; i++) { // iterator를 사용하면 안됨
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }
}
