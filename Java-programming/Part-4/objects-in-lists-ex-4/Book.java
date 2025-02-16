
public class Book {
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    // Everything
    public String returnE() {
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
    
    public String returnTitle() {
        return this.title;
    }
}
