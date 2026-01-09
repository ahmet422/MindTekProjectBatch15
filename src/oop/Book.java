package oop;

public class Book {
    // fields
    static int count;
    static String language = "English";
    private String name;
    private String author;
    private int pageAmount;

    // constructor
    public Book(String name, String author, int pageAmount) {
        this.name = name;
        this.author = author;
        this.pageAmount = pageAmount;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }
}
