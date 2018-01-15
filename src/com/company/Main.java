package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    private static int array[] = new int[10];
    public static int placeholder;
    public static int runtotal;
    public static int number;
    public static int mean;
    public static int difference;
    public static int difference2;
    public static int difference3;
    public static int variance;
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("How many numbers are in your list?");
        number = scanInput.nextInt();
        userio();
        sortFunction();
        display();
        mean();
        variance();
        largest();
    }
    private static void sortFunction(){
        for (int y=0; y<array.length; y++) {
            for (int i = 0; i < array.length - 1; ) {
                if (array[i] < array[i + 1]) {
                    placeholder = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = placeholder;
                    i++;
                } else {
                    i++;
                }
            }
        }
    }
    private static void userio(){
        int number;
        Scanner scaniInput = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.print("Please enter a number in your list");
            number = scaniInput.nextInt();
            array[i]=number;
        }
    }
    private static void display(){
        System.out.println(Arrays.toString(array));
    }
    private static void mean(){
        for (int s=0; s<array.length; s++){
            runtotal = runtotal + array[s];
        }
        mean = (runtotal/array.length);
        System.out.print("Here are some cool stats" + '\n');
        System.out.print("The mean of your list is " + mean );
    }
    private static void variance(){
        for (int v = 0; v < array.length; v++){
            difference = array[v] - mean;
            difference2 = difference*difference;
            difference3 = difference3 + difference2;
        }
       variance = difference3 / array.length;
        System.out.print('\n' + "The variance of your list is " + variance);
        double root = Math.sqrt(variance);
        System.out.print('\n' + "The standard deviation of your list is " + root);
    }
    private static void largest(){
        System.out.print('\n' + "The largest number in your list is " + array[0]);
    }
}
