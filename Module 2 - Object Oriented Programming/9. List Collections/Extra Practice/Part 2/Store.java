import java.util.ArrayList;
import java.util.Objects;

public class Store {
    private ArrayList<Book> books;

    //1. create a constructor for Store that initialises an empty arrayList of Book objects
    public Store() {
        this.books = new ArrayList<Book>();
    }

    //2. create a getBook method that takes an index as the parameter and returns a deep copy of the Book object
    public Book getBook(int index) {
        return new Book(this.books.get(index));
    }

    //3.create a setBook method that takes a Book object and the index parameters and
    //sets the Book object at the specified index to a deep copy of the given object
    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    //4.create an addBook method that takes a Book object as a parameter and returns true if the books ArrayList contains the given object, false otherwise
    public void addBook(Book book){
        this.books.add(new Book(book));
    }

    //5. create a contains method that takes a Book object as a parameter and returns true if the books ArrayList contains the given object, false otherwise
    public boolean contains(Book book){
        return this.books.contains(book);
    }

    //7. create sellBook method that takes a String title as a parameter and removes the Book object with the specified title from the books ArrayList.
    public void sellBook(String title){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(title)){
                this.books.remove(i);
            }
        }
    }

}
