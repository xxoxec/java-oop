package construct.ex;

public class BookMain {

    public static void main(String[] args) {
        // 기본 생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        // title, author 만을 매개변수로 받는 생성자
        Book book2 = new Book("JAVA", "KIM");
        book2.displayInfo();

        // 모든 필드를 매개변수로 받는 생성자
        Book book3 = new Book("JPA ", "LEE", 700);
        book3.displayInfo();
    }
}
