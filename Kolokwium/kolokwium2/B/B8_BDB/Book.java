package B.B8_BDB;
public class Book implements Comparable<Book> {
    private String title;
    private int pages;
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
    // Metoda compareTo pochodząca z interfejsu Comparable, umożliwiająca porównywanie obiektów klasy Book.
    public int compareTo(Book o) {
        // Pierwszeństwo ma liczba stron, jeśli jest większa niż u porównywanej książki, zwracamy 1.
        if (pages > o.pages) return 1;
            // Jeśli liczba stron jest mniejsza niż u porównywanej książki, zwracamy -1.
        else if (pages < o.pages) return -1;
            // Jeśli liczba stron jest taka sama, to porównujemy tytuły książek.
        else if (pages == o.pages && !title.equals(o.title)) return title.compareTo(o.title);
        // Jeśli liczba stron i tytuły są takie same, zwracamy 0.
        return 0;
    }
}
