/**
 * Created by praneet on 6/20/18.
 */
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class ArrayTutorial {

    public static void main(String[] args) {
       Integer[] testData = generateData(100);
       printArray(testData);
       smallestElementInArray(testData);
       biggestElementInArray(testData);
       sortArray(testData);
       System.out.println("Sorted Array (Ascending Order): ");
       printArray(testData);
       System.out.println("Sorted Array (Descending Order): ");
       reverseArray(testData);

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

    public static Integer[] breakDownArrays(int numberOfArrays, Integer[] arr){
        ArrayList<Integer> breakDown = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < numberOfArrays; i++){
            System.out.println("How many in array" + (i+1));
            Integer numberInBrokenDownArray = s.nextInt();
            breakDown.add(numberInBrokenDownArray);
            Integer[] array = new Integer[numberInBrokenDownArray];
        }

        return null;
    }

    public static Integer smallestElementInArray(Integer[] arr) {
       sortArray(arr);

       int smallestValue = arr[0];

        System.out.println("Smallest element in array: " + smallestValue);

        return smallestValue;
    }

    public static Integer biggestElementInArray(Integer[] arr) {
        sortArray(arr);

        int length = arr.length;

        int biggestValue = arr[length - 1];

        System.out.println("Biggest element in array: " + biggestValue);

        return biggestValue;
    }

    public static Integer[] mergeArrayAlternately(Integer[] arr1, Integer[] arr2) {


        return null;
    }

    public static Integer[] sortArray(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){

                if (arr[i] > arr[j]){

                     int temporary = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temporary;
                }
            }
        }

        return arr;
    }

    public static void reverseArray(Integer[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = temp;
        }

        printArray(arr);

    }


    public static Integer[] uniqueElementOfArray(Integer[] arr){

        return null;
    }

}




