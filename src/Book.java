public class Book {

    private String title;
    private Author author;
    private int dateCreate;

    public Book(String title, Author author, int dateCreate ) {
        this.title = title;
        this.author = author;
        this.dateCreate = dateCreate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }
}
