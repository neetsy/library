package myFacebook;

/**
 * Created by praneet on 6/24/18.
 */
import java.util.*;

public class User {
    List<User> friendList = new ArrayList<User>();
    String name;
    String userName;
    Integer age;

    public User(String name, String userName, Integer age) {
        this.name = name;
        this.userName = userName;
        this.age = age;
    }

    public void addFriends(User f)
    {
        friendList.add(f);
    }

    public List<User> findFriends(String name) {
        List<User> filteredSearch = new ArrayList<User>();
        for (User u:friendList)
        {
        if(u.name.toLowerCase().contains(name.toLowerCase())){
            filteredSearch.add(u);
            }
        }

        return filteredSearch;
    }

    public void printFriends() {
        for(User u: friendList) {
            System.out.println("Username: "+u.userName+" Name: "+u.name);
        }
    }
}

