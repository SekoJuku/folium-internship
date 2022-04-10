package friday.creational.prototype;

import java.util.Objects;

public class Book {
    private int pages;
    private String name;

    public Book() {
    }

    public Book(int pages, String name) {
        this.pages = pages;
        this.name = name;
    }

    public Book(Book book) {
        if(book != null) {
            this.name = book.getName();
            this.pages = book.getPages();
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(name, book.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }
}
