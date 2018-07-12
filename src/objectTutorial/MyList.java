package objectTutorial;

/**
 * Created by praneet on 6/24/18.
 */
public class MyList {
//  Access modifier is default
    String test;

    public MyList(String name, Integer i) {
        System.out.println("Initializing My List "+name);
        test=name;
        for(;i>0;i--) {
            System.out.println(test+"  "+i);
        }
    }
}
