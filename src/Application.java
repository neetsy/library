/**
 * Created by praneet on 6/19/18.
 */
import java.awt.print.*;
import java.util.*;
public class Application {

    public static void main(String[] args){
        System.out.println("Library Application Has Started");
        Library library = new Library();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Praneet Libsoft> ");
            String command = s.nextLine().toLowerCase();
            if (command.equals("list student")){
                library.printMembers();
            }
            if (command.equals("list book")){
                library.printCollection();
            }

            if (command.equals("add book")) {

                Book book = getBook(s);
                library.addBook(book);
            }
            if (command.equals("add student")) {

                Student student = addStudent(s);
                library.register(student);
            }
            if (command.equals("find student")) {
               List<Student> filteredStudents = library.findStudent(s);
                for (Student student: filteredStudents
                     ) {
                    student.printStudent();
                }
            }
            if (command.equals("find book")) {
                 List<Book> filteredBooks = library.findBook(s);
                for (Book book : filteredBooks) {
                    book.printBook();

                }
            }

//            if(command.equals("remove student")){
//                library.removeStudent(s);
//            }

            if (command.equals ("exit")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    public static Book getBook(Scanner s){
        System.out.print("Enter Title: ");
        String title = s.nextLine();
        System.out.print("Enter Author: ");
        String author = s.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = s.nextLine();
        System.out.print("Enter number of chapters: ");
        Integer chapter = s.nextInt();
        System.out.print("Enter number of pages: ");
        Integer pages = s.nextInt();

        Book book = new Book();
        book.title = title;
        book.author = author;
        book.isbn = isbn;
        book.chapters = chapter;
        book.pages = pages;
        return book;
    }

    public static Student addStudent(Scanner s){
        System.out.print("Student Name: ");
        String name = s.nextLine();
        System.out.print("Student Age: ");
        Integer age = s.nextInt();

        Student student = new Student();
        student.name = name;
        student.age = age;
        return student;
    }




}
