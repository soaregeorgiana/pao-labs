package ro.unibuc.lab12.database.domain;

public class Book {

    private int id;
    private String title;
    private int code;
    private boolean isBorrowed;

    public Book(String title, int code, boolean isBorrowed) {
        this.title = title;
        this.code = code;
        this.isBorrowed = isBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", code=" + code +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
