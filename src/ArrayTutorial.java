/**
 * Created by praneet on 6/20/18.
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class ArrayTutorial {

    public static void main(String[] args) {
        List<Integer[]> l = generateListOfArrays(500, 5);
        for (Integer[] arr: l) {
            printArray(arr);
        }
        printArray(combineAllArrays(l));

    }

    public static Integer[] search() {

        Integer[] data = new Integer[1000];
        Random number = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = number.nextInt(20000) - 10000;
            data[i] = randomNumber;
        }
        System.out.println("Numbers less than 1000");
        List<Integer[]> filteredNumbers = new ArrayList<Integer[]>();
        for (Integer randomNumber : data) {
            if (randomNumber < 1000) {
                System.out.println(randomNumber);

            }
        }
        System.out.println("Numbers between -1000 and 1000");
        List<Integer[]> furtherFilteredNumbers = new ArrayList<Integer[]>();
        for (Integer randomNumber : data) {
            if (randomNumber > -1000 && randomNumber < 1000) {
                System.out.println(randomNumber);
            }
        }

        return data;
    }

    public static Integer[] generateData(int size) {
        Random generator = new Random();
        Integer[] testData = new Integer[size];
        for (int d = 0; d < size; d++) {
            int fillData = generator.nextInt(5000);
            testData[d] = fillData;
        }
        return testData;
    }

    public static Integer[] mergeArray(Integer[] arr1, Integer[] arr2) {
        int arr3length = arr1.length + arr2.length;
        Integer[] arr3 = new Integer[arr3length];
        for (int l = 0; l < arr1.length; l++) {
            arr3[l] = arr1[l];
        }

        for (int l = 0; l < arr2.length; l++) {
            arr3[arr1.length + l] = arr2[l];
        }
        return arr3;
    }

    public static void mergeTest1() {
        Integer[] arr1 = generateData(7);
        Integer[] arr2 = generateData(5);
        printArray(arr1);
        printArray(arr2);
        Integer[] arr3 = mergeArray(arr1, arr2);
        printArray(arr3);
    }
// Add from web git
    public static void printArray(Integer[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }

    public static List<Integer[]> generateListOfArrays(int listSize, int arraySize){
        List<Integer[]> combinedList = new ArrayList<Integer[]>();
        for(int i = 0; i < listSize; i++){
            combinedList.add(generateData(arraySize));
        }
        return combinedList;
    }

    public static Integer[] combineAllArrays(List<Integer[]> listOfArrays){
        Integer[] finalArray = new Integer[0];
        for (Integer[] arr: listOfArrays) {
            finalArray = mergeArray(arr,finalArray);
        }
        return finalArray;
    }

}




