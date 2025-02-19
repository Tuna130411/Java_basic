package day12;

public class Day12Book {
    private String bookName;
    private String writer;
    private boolean isrented;

    public Day12Book(String bookName, String writer, boolean isrented) {
        this.bookName = bookName;
        this.writer = writer;
        this.isrented = isrented;
    }

    public void rentBook() {
        if (isrented == false) {
            System.out.println(bookName + "이(가) 대여되었습니다.");
            isrented = true;
        } else {
            System.out.println(bookName + "은(는) 이미 대여 중입니다.");
        }
    }

    public void introduce() {
        String s = isrented == true ? "대여 중" : "대여 가능";
        System.out.println("제목: " + bookName + ", 대여 상태: " + s);
    }
}
