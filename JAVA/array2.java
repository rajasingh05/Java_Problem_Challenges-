import java.util.*;
public class array2 {

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Array references in java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for(int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println("Original array");
        printArray(arr);

        // trying to copy arr to arr_2

        int[] arr_2 = arr;

        // for(int i = 0; i < n; i++) {
        //     System.out.print(arr_2[i] + " ");
        // }

        
        System.out.println("Copied array");
        printArray(arr_2);

        sc.close();

    }
    
}
