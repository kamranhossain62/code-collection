import java.util.*;

public class bubblesort {

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {2, 5, 6, 4, 8, 9, 10, 0};

        int n = arr.length;

        System.out.println("Before sorting:");
        print(arr);

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        print(arr);
    }
}