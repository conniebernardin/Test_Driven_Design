package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingLists {
    public static void main(String[] args) {

        System.out.println("set list size:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        List<Integer> numberList = new ArrayList<>();

        //determining size of list by adding value to index point for length of input
        for(int i = 0; i<input; i++){
            int indexValue = i;
            numberList.add(indexValue);
        }

        System.out.println(fillList(numberList));

    }
    public static List<Integer> fillList(List<Integer> numberList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add numbers to list");

        int length = numberList.size();

        List<Integer> fillList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (fillList.size() < length) {
                fillList.add(scanner.nextInt());
            }
        }

    return fillList;
    }

}
