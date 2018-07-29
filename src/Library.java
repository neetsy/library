/**
 * Created by praneet on 6/19/18.
 */
import java.util.*;
import java.lang.*;


public class Library {
     public List<Book> collection = new ArrayList<Book>();
     public List<Student> members = new ArrayList< Student>();

     public void register(Student s){
         s.id = members.size()+1;
         members.add(s);
     }

     /*public void unenroll(Student s){

         members.remove(s);
     }*/

     public void addBook(Book b){
         b.id = collection.size()+1;
         collection.add(b);

     }

     public void printCollection(){
         for (Book b: collection)
               {
            b.printBook();
         }
     }

     public void printMembers(){
         for (Student s: members)
               {
             s.printStudent();
         }
     }

    public List<Student> findStudent(Scanner s){
        List<Student> listOfStudents = new ArrayList<Student>();
        System.out.println("Search By name: Press 1 ");
        System.out.println("Search By age: Press 2 ");
        System.out.println("Search By id: Press 3 ");
        Integer searchType = s.nextInt();
        String name = null;
        if (searchType == 1) {
            searchByName(s, listOfStudents);
        }
        Integer age = null;
        if (searchType == 2) {
           searchByAge(s, listOfStudents);
        }
        Integer id=null;
        if (searchType == 3) {
            searchById(s, listOfStudents);
        }

        return listOfStudents;
    }

    public List<Student> searchByName(Scanner s, List listOfStudents){
        String name = null;
        System.out.print("Student Name: ");
        name = s.next().toLowerCase();
            for (Student member : members) {
                if(member.name.toLowerCase().contains(name))
                    listOfStudents.add(member);
            }
        return listOfStudents;
    }

    public List<Student> searchByAge(Scanner s, List listOfStudents){
        Integer age = null;
        System.out.print("Student Age: ");
        age = s.nextInt();
            for (Student member : members){
                if(member.age.equals(age))
                    listOfStudents.add(member);
            }
        return listOfStudents;
    }

    public List<Student> searchById(Scanner s, List listofStudents) {
        Integer id = null;
        System.out.print("Student ID: ");
        id = s.nextInt();
            for (Student member : members){
                if(member.id.equals(id))
                    listofStudents.add(member);
            }
        return listofStudents;
    }
    public List<Book> findBook(Scanner s){
       List<Book> listOfBooks = new ArrayList<Book>();
       System.out.println("Search by Title: Press 1");
       System.out.println("Search by Author: Press 2");
       System.out.println("Search by ISBN: Press 3");
       System.out.println("Search by Number of Chapters: Press 4");
       System.out.println("Search by Number of Pages: Press 5");
       Integer searchType = s.nextInt();

       if(searchType == 1){
           searchByTitle(s, listOfBooks);
       }

       if(searchType == 2){
           searchByAuthor(s, listOfBooks);
       }

       if(searchType == 3){
           searchByIsbn(s, listOfBooks);
       }

       if(searchType == 4){
           searchByChapter(s, listOfBooks);
       }

       if(searchType == 5){
           searchByPages(s, listOfBooks);
       }

       return listOfBooks;
    }

    public List<Book> searchByTitle(Scanner s, List listofBooks){
        String title = null;
        System.out.print("Book Title: ");
        title = s.next().toLowerCase();
            for (Book book : collection) {
                if (book.title.toLowerCase().contains(title)) {
                    listofBooks.add(book);

                }
            }


        return listofBooks;
    }

    public List<Book> searchByAuthor(Scanner s, List listOfBooks) {
        String authorName = null;
        System.out.print("Book Author: ");
        authorName = s.next().toLowerCase();
        for (Book book : collection) {
            if (book.author.toLowerCase().contains(authorName)) {
                listOfBooks.add(book);
            }
        }
        return listOfBooks;
    }

    public List<Book> searchByIsbn(Scanner s, List listOfBooks){
        String isbn = null;
        System.out.print("Book ISBN: ");
        isbn = s.next();
            for(Book book : collection){
                if(book.isbn.equals(isbn)){
                    listOfBooks.add(book);
                }
            }

        return listOfBooks;
    }

    public List<Book> searchByChapter(Scanner s, List listOfBooks){
        Integer chapter = null;
        System.out.print("Book Chapters: ");
        chapter = s.nextInt();
        for(Book book : collection){
            if(book.chapters.equals(chapter)){
             listOfBooks.add(book);
            }
        }

        return listOfBooks;
    }

    public List<Book> searchByPages(Scanner s, List listOfBooks){
        Integer pages = null;
        System.out.print("Book Pages: ");
        pages = s.nextInt();
        for(Book book : collection){
            if(book.pages.equals(pages)){
            listOfBooks.add(book);
            }
        }

        return listOfBooks;
    }

//    public List<Student> removeStudent(Scanner s, List members){
//        int counter;
//        counter = 0;
//        System.out.print("Full Name of Student: ");
//        String studentRemoved = s.next().toLowerCase();
//////        for (Student student: members) {
////            if(student.name.toLowerCase().equals(studentRemoved)){
////                System.out.println("Successfully removed " + student.name);
////                members.remove(counter);
////                counter++;
////            }
////
////        }
////        return members;
////    }
////
}
