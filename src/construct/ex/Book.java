package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    Book() {
        this("","",0);
    };

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("책 제목 : " + this.title + ", 책 저자 : " + this.author + ", 책 페이지 : " + this.page);
    }
}
