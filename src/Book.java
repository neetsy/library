/**
 * Created by praneet on 6/19/18.
 */
public class Book {
    public String title;
    public String author;
    public Integer chapters;
    public Integer pages;
    public String isbn;
    public Integer id;

    public void printBook(){
        System.out.println("Book Title:"+ title  +" Book ID:"+ id+ " Book Author:" + author);
    }
}
