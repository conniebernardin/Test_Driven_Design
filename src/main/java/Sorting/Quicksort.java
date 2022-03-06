package Sorting;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    public static void main(String[] args) {

        //creating random array of 10 integers between 0 and 100.
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i<numbers.length; i ++){
            numbers[i] = rand.nextInt(100);
        }

        //give low index as 0 and high index as last number in array
        quicksort(numbers, 0, numbers.length-1);

        System.out.println(Arrays.toString(numbers));
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex){
        // if low index greater than high then we know it is a sub-array of just one element, so sorted by default
        if(lowIndex >= highIndex){
            return;
        }

        //first step in algorithm is to choose a pivot

        int pivot = array[highIndex];

        //partition all numbers lower than pivot to left and higher to right.

        int leftpointer = lowIndex;
        int rightpointer = highIndex;

        while (leftpointer < rightpointer) {
            //keep incrementing left pointer until value of array at that point is equal to pivot or right pointer.
            while (array[leftpointer] <= pivot && leftpointer < rightpointer) {
                leftpointer++;
            }
            //decrement right pointer to move it through array
            while (array[rightpointer] >= pivot && leftpointer < rightpointer) {
                rightpointer--;
            }
            swap(array, leftpointer, rightpointer);
            }
            swap(array, leftpointer, highIndex);

            //recursively quicksort elements below pivot
            quicksort(array, lowIndex, leftpointer-1);

            //recursively sort elements above pivot
            quicksort(array, leftpointer +1, highIndex);


        //swaps left pointer with pivot
        //end of partitioning step and pivot divides numbers between low and high
        swap(array, leftpointer, highIndex);

    }

    private static void swap(int [] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
