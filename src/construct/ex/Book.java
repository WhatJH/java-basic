package construct.ex;

public class Book {

    String title;
    String author; // 저자
    int page; // 페이지 수

    // 기본생성자
    Book(){
        this("", "", 0);
    }
    // 비워두면 안됨 -> 출력시 기본값 null이 됨.

    // title과 author만을 매개변수로 받는 생성자
    Book(String title, String author){
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
