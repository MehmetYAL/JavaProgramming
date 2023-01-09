package day47_PolymorphismCont;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
       setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
