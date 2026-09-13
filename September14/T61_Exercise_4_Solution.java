package September14;
// Exercise 4: Solution

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String [100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[this.no_of_books] = book;
        this.no_of_books++;
        System.out.println("Book added");
    }

    void printBooks(){
        for(int i=0;i<this.no_of_books;i++){
            System.out.println("* " + this.books[i]);
        }
    }

    void issuebook(String book){
        this.books[this.no_of_books] = book;
        this.no_of_books++;
        System.out.println("Book issued");
    }
}
public class T61_Exercise_4_Solution {
    public static void main(String[] args) {
    Library CentralLibrary = new Library();
    CentralLibrary.addBook("Harry Potter");
    CentralLibrary.addBook("Think and grow rich");
    CentralLibrary.addBook("JABAJ RISAN BABA");
    CentralLibrary.addBook("JAVA");
    CentralLibrary.printBooks();
    CentralLibrary.issuebook("Harry Potter");
    }
}
