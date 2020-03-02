package koochaiyaphum.nitisak.exam1;

/** 
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: january 27, 2020
* Exam1
*
**/
public class Book {
    
    private String title;
    private String author;
    private static int onOfBook;
    private double price;
    private static koochaiyaphum.nitisak.exam1.Book.BookGenres BookGenres;

    public enum BookGenres {
        ART, AUTOBIOGRAPHY, FICTION, TRAVEL, MAGAZINE, OTHER
    }

    public Book() {
        title = "No title";
        author = "No author";
        price = 0.0;
        onOfBook = 1;
        BookGenres = BookGenres.OTHER;
    }

    public Book(String title, String author, double price, BookGenres fiction) {
        this.title = title;
        this.author = author;
        this.price = price;
        Book.BookGenres = BookGenres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String string) {
        this.title = title;
    }

    public String getAuthor(String author) {
        return author;
    }

    public void setAutor(String string) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price < 0 ){

        }
    }

    public koochaiyaphum.nitisak.exam1.Book.BookGenres getGenres() {
        return BookGenres;
    }

    public void setGenres(BookGenres travel) {
        this.BookGenres = travel;
    }

    public boolean isCheaper(Book book2) {
        return false;
    }

    public static int getNoOfBook() {
        return onOfBook;
	}

    @Override
    public String toString() {
        return  ": Title :" + title +  " Author :" + author + ", onOfBook:" + onOfBook + ", price:" + price + ", title:" + title + "]";
    }
    
}