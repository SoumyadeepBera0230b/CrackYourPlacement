import java.util.Arrays;

public class permute_two_arrays {
    public static void main(String[] args) {
        int a[] = { 2, 1, 3 };
        int b[] = { 7, 8, 9 };
        int k = 10;
        boolean res = permute(a, b, k);
        System.out.println(res);

    }

    public static boolean permute(int a[], int b[], int k) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[a.length - 1 - i] == k) {
                return true;
            }
        }
        return false;
    }
}