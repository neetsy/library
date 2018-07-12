/**
 * Created by praneet on 6/20/18.
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class ArrayTutorial {

    public static void main (String[] args) {
        search();
    }

    public static Integer[] search() {

        Integer[] data = new Integer[1000];
        Random number = new Random();
        for (int i = 0; i<1000; i++){
            int randomNumber = number.nextInt(20000)-10000;
            data[i] = randomNumber;
        }
        System.out.println("Numbers less than 1000");
        List<Integer[]> filteredNumbers = new ArrayList<Integer[]>();
        for (Integer randomNumber: data)
        {
            if(randomNumber< 1000) {
               System.out.println(randomNumber);

            }
        }
        System.out.println("Numbers between -1000 and 1000");
        List<Integer[]> furtherFilteredNumbers = new ArrayList<Integer[]>();
        for (Integer randomNumber:data) {
            if(randomNumber > -1000 && randomNumber < 1000){
                System.out.println(randomNumber);
            }
        }

        return data;
    }



    }

