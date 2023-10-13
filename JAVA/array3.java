// import java.util.*;
public class array3 {

    static void change_array(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = 0;
            }
        }
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        change_array(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
