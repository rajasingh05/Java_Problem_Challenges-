// Q1. Count the number of occurrences of a particular element x.

import java.util.*;
public class practice1 {

    static int countOccurs(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: " + countOccurs(arr, x));

        sc.close();
    }
    
}
