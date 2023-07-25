import java.util.*;

public class pair_with_given_difference {
    public static void main(String[] args) {
        int arr[] = { 5, 20, 3, 2, 50, 80 };
        int n = 78;

        pair(arr, n);
    }

    public static void pair(int arr[], int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int index[] = { 0, 0 };

        // Using two loops

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == n) {
                    index[0] = arr[i];
                    index[1] = arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(index));

        // Using two pointers

        Arrays.sort(arr, 0, arr.length - 1);
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[j] - arr[i] == n) {
                a.add(arr[i]);
                a.add(arr[j]);
            }
            if (arr[j] - arr[i] > n)
                j -= 1;
            else
                i += 1;
        }
        System.out.println(a);

    }
}