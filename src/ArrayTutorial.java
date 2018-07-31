/**
 * Created by praneet on 6/20/18.
 */
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class ArrayTutorial {

    public static void main(String[] args) {
        mostOccurringCharacter("aaaaa bbbbb cccc ddddd");

//        wordCounter("Hello my name defines who who my Hello person is Hello");
//        wordCounter("Hello my name defines who who my Hello person is Hello Hello my name defines who who my Hello person is Hello");
//        charBreakdown("Praneetsai Iddamsetty");
////       Integer[] testData = generateData(10);
////       printArray(testData);
//////       smallestElementInArray(testData);
//////       biggestElementInArray(testData);
////       sortArray(testData);
////       System.out.println("Sorted Array (Ascending Order): ");
////       printArray(testData);
////       System.out.println("Sorted Array (Descending Order): ");
////       reverseArray(testData);
////        printArray(testData);
//          Integer[] testData = {2, 5, 2, 6, 3, 2, 2, 4, 67, 2};
//          Integer[] uniqueData = uniqueElementOfArray(testData);
//          printArray(uniqueData);
//
//          char a = 98;
//          System.out.println(a);
//
////        String s = "abcdefghijklmnopqrstuvwxyz";
////        char[] a = s.toCharArray();
////        char[] b = s.toUpperCase().toCharArray();
////        for(int i =0 ;i<a.length;++i) {
////            System.out.print((int) a[i] +" ");
////        }
////        System.out.println();
////        for(int i =0 ;i<b.length;++i) {
////            System.out.print((int) b[i] +" ");
////        }

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

    public static Integer smallestElementInArray(int[] arr) {
       sortArray(arr);

       int smallestValue = arr[0];

        System.out.println("Smallest element in array: " + smallestValue);

        return smallestValue;
    }

    public static Integer biggestElementInArray(int[] arr) {
        sortArray(arr);

        int length = arr.length;

        int biggestValue = arr[length - 1];

        System.out.println("Biggest element in array: " + biggestValue);

        return biggestValue;
    }

    public static Integer[] mergeArrayAlternately(Integer[] arr1, Integer[] arr2) {


        return null;
    }


    public static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){

                if (arr[i] > arr[j]){

                     int temporary = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temporary;
                }
            }
        }

    }

    public static void reverseArray(Integer[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = temp;
        }
    }


    public static Integer[] uniqueElementOfArray(Integer[] arr){
        int firstPointer = 0;
        int lastPointer = arr.length-1;
        for (firstPointer = 0; firstPointer < lastPointer; firstPointer++) {
            for (int i = 0; i < firstPointer; i++){
                if(arr[i] != arr[firstPointer]) {
                    continue;
                } else {
                    int temp = arr[firstPointer];
                    while(arr[firstPointer]==arr[lastPointer] && lastPointer>0) {
                        --lastPointer;
                    }
                    arr[firstPointer] = arr[lastPointer];
                    arr[lastPointer] = temp;
                    lastPointer--;
                    break;
                }
            }
        }
        Integer[] uniqueData = new Integer[lastPointer];
        for (int i = 0; i < lastPointer; i++) {
            uniqueData[i] = arr[i];
        }
        return uniqueData;
    }

    public static void charBreakdown (String a) {

        char[] charArray =  a.toCharArray();
        int[] asciiMatch = new int[52];
        for (char character: charArray) {
            if(character==' ') {
                continue;
            }
            int matchReference = (int) character;
            if(matchReference < 91) {
              asciiMatch[matchReference-65]++;
            } else {
                asciiMatch[matchReference-71]++;
            }

        }

        for(int i = 0; i < asciiMatch.length; i++){
            if(asciiMatch[i] == 0){
                continue;
            }
            char acciiChar = 0;
            if(i<26) acciiChar= (char) (i+65);
            else acciiChar=  (char) (i+71);
            System.out.println(acciiChar+": "+ asciiMatch[i]);
        }
        System.out.println();
    }

    public static void wordCounter(String stringOfWords) {
        int firstPointer = 0;
        int lastPointer = 0;
        String[] wordBreakdown = stringOfWords.split(" ");
        lastPointer = wordBreakdown.length;
        for (firstPointer = 0; firstPointer < lastPointer; firstPointer++) {
            for(int i = 0; i < firstPointer; i++){
                if (!wordBreakdown[i].equals(wordBreakdown[firstPointer]) ) {
                   continue;

                } else {
                    System.out.println("Before while: " + firstPointer + " & " +lastPointer);
                    String temp = wordBreakdown[firstPointer];
                    while (wordBreakdown[firstPointer].equals(wordBreakdown[lastPointer-1]) && lastPointer>0){
                        lastPointer--;
                    }
                    if(firstPointer == lastPointer){
                        break;
                    }
                    System.out.println("After while, before decrement: " + lastPointer);
                    wordBreakdown[firstPointer] = wordBreakdown[lastPointer-1];
                    wordBreakdown[lastPointer-1] = temp;
                    lastPointer--;
                    firstPointer--;
                    System.out.println(lastPointer);
                    System.out.println(stringOfWords);
                    for(int o = 0; o < wordBreakdown.length; o++){
                        System.out.print(wordBreakdown[o] + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
        String[] uniqueWords = new String[lastPointer];
        for (int i = 0; i < lastPointer; i++){
            uniqueWords[i] = wordBreakdown[i];
        }
        int[] counterOfUniqueWords = new int[uniqueWords.length];
        for (String word: wordBreakdown) {
            for (int i = 0; i < uniqueWords.length; i++){
                if(word.equals(uniqueWords[i])){
                    counterOfUniqueWords[i]++;
                }
            }
        }
        System.out.println(lastPointer);

        for(int i = 0; i < uniqueWords.length; i++){
            System.out.println(uniqueWords[i] + ": " + counterOfUniqueWords[i]);
        }
        System.out.println();

    }

    
// Question 1
// Sum of array elements excluding the elements which lie between a and b
// Given an array of N unique numbers. Also given two numbers a and b such that a will always be before b in the array. The task is to find the sum of the array elements excluding the elements which lie between a and b.

// Examples:

// Input : arr = [2, 1, 6, 9, 11], a = 6, b = 9
// Output : 14

// Input : arr = [1, 2, 4, 5, 6], a = 2, b = 5
// Output : 7
    
// Question 2
// Largest gap in an array
// Given an unsorted array of length N and we have to find largest gap between any two elements of array.In simple words, find max(|Ai-Aj|) where 1 ≤ i ≤ N and 1 ≤ j ≤ N.

    public static void rangeOfArray(Integer[] arr) {
        Integer lowest = arr[0];
        Integer highest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }

            if(arr[i] > highest){
                highest = arr[i];
            }
        }

        System.out.println("Range of Array: " + (highest - lowest));
    }
// Examples:

// Input : arr = {3, 10, 6, 7}
// Output : 7
// Explanation :
// Here, we can see largest gap can be
// found between 3 and 10 which is 7

// Input : arr = {-3, -1, 6, 7, 0}
// Output : 10
// Explanation :
// Here, we can see largest gap can be 
// found between -3 and 7 which is 10
    
// Question 3
// Given an array of integers, segregate even and odd numbers in the array. All the even numbers should be present first, and then the odd numbers.
public static void evensAndOdds(Integer[] arr){

}
// Examples:

// Input : 1 9 5 3 2 6 7 11
// Output : 2 6 5 3 1 9 7 11

// Input : 1 3 2 4 7 6 9 10
// Output : 2 4 6 10 7 1 9 3
    
// Question 4
// Given a string containing lowercase characters. The task is to print the maximum occurring character in the input string. If 2 or more characters appear the same number of times, print the lexicographically (alphabetically) lowest (first) character.
public static void mostOccurringCharacter(String string) {

    char[] charArray =  string.toCharArray();
    int[] asciiMatch = new int[52];
    for (char character: charArray) {
        if(character==' ') {
            continue;
        }
        int matchReference = (int) character;
        if(matchReference < 91) {
            asciiMatch[matchReference-65]++;
        } else {
            asciiMatch[matchReference-71]++;
        }

    }

    int largestValue = asciiMatch[0];
    for(int i = 1; i < asciiMatch.length; i++){
        if(asciiMatch[i] > largestValue){
            largestValue = asciiMatch[i];
        }

    }

    for(int o = 0; o < asciiMatch.length; o++){
        if(asciiMatch[o] == largestValue){
            char acciiChar = 0;
            if(o<26) acciiChar= (char) (o+65);
            else acciiChar=  (char) (o+71);
            System.out.println("Most occurring character: ");
            System.out.println(acciiChar + ": " + asciiMatch[o]);
            System.exit(0);
        }
    }

}
// Examples:

// Input: test sample
// Output: e
// ‘t’, ‘e’ and ‘s’ appears 2 times, but ‘e’ is the lexicographically smallest character.

// Input: sample program
// Output: a

}




