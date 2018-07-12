package myFacebook;

import java.util.List;

/**
 * Created by praneet on 6/24/18.
 */
public class MyFaceBookApp {

    public static void main (String [] args){
        User praneetIddamsetty = loadTestDat();
        User jhon = null;
        for(User u: praneetIddamsetty.friendList) {
            if(u.name.toLowerCase().contains("John".toLowerCase())) {
                jhon = u;
                break;
            }
        }
        List<User> allJohns = praneetIddamsetty.findFriends("John");
        for(User u:allJohns) {
            jhon.addFriends(u);
        }
        jhon.printFriends();


    }

    public static User loadTestDat() {
        User praneetIddamsetty = new User("Praneet Iddamsetty", "vasu6657", 14);
        User johnDoe = new User("John Doe", "johndoe", 23);
        User genericName = new User("Generic Name", "genericName", 45);
        User nameGeneric = new User("Name Generic", "nameGeneric", 25);
        User genericnameGeneric = new User( "Genericname Generic", "genericnameGeneric", 35);
        User johnDoe1 = new User("John Doe 1", "johnDoe1", 78);
        User johnDoe2 = new User("John Doe 2", "johnDoe2", 54);
        praneetIddamsetty.addFriends(johnDoe);
        praneetIddamsetty.addFriends(genericName);
        praneetIddamsetty.addFriends(nameGeneric);
        praneetIddamsetty.addFriends(genericnameGeneric);
        praneetIddamsetty.addFriends(johnDoe1);
        praneetIddamsetty.addFriends(johnDoe2);
        return praneetIddamsetty;
    }

}
