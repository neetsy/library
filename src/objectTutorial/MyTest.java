package objectTutorial;

/**
 * Created by praneet on 6/24/18.
 */
import java.util.*;
public class MyTest {

    public static void main (String[] args){
//        MyList list;
//        list = new MyList("list",5);
//
//        MyList list1 = new MyList("list1",7);
//
//        MyList list2 = new MyList("list2",9);
////        System.out.println(list.test);
////        list.test = "list";
////        list1.test = "list1";
////        list2.test = "list2";

        PaperClip pin1 = new PaperClip("1");
        PaperClip pin2 = new PaperClip("2");
        PaperClip pin3 = new PaperClip("3");
        PaperClip pin4 = new PaperClip("4");
        PaperClip pin5 = new PaperClip("5");
        pin1.nextPaperClip = pin2;
        pin2.nextPaperClip = pin3;
        pin3.nextPaperClip = pin4;
        pin4.nextPaperClip = pin5;
//        pin5.nextPaperClip = pin1;

        PaperClip p = pin1;

//        List<String> memory = new ArrayList<String>();
//        while(p!= null) {
//            System.out.println(p.name);
//            if(memory.contains(p.name)){
//                break;
//            }
//            memory.add(p.name);
//            p = p.nextPaperClip;

//        }
        System.out.println(rangeSearch(pin1,"1", "5"));
    }

    public static List<String> rangeSearch(PaperClip start, String p1, String p2) {
        PaperClip pin1 = start;
        while(pin1!=null && !pin1.name.equals(p1)){
            pin1 = pin1.nextPaperClip;
        }
        pin1 = pin1.nextPaperClip;
        List<String> range = new ArrayList<String>();
        while(pin1!=null && !pin1.name.equals(p2)){
            range.add(pin1.name);
            pin1 = pin1.nextPaperClip;
        }
        return range;
    }
}
