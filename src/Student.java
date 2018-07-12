import java.util.List;

/**
 * Created by praneet on 6/19/18.
 */
public class Student {

    public String name;
    public Integer id;
    public Integer age;
    public List<Book> borrowedBooks;

    public void borrowBook(Book b){
        borrowedBooks.add(b);
    }

    public void printStudent(){
        System.out.println("Student Name: " + name + " Student Age: " + age + " Student ID: " + id);
    }

    public void printBooks(){
        for (Book b: borrowedBooks)
              {
            b.printBook();
        }
    }
}
