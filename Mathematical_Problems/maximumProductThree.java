
import java.util.Arrays;

public class maximumProductThree {
    public static void main(String[] args) {
        int max_arr[] = { -100, -98, -2, 2, 3, 4 };
        int res = maximumProduct(max_arr);
        System.out.println(res);

    }

    public static int maximumProduct(int[] max_arr) {

        Arrays.sort(max_arr);
        int case1 = max_arr[0] * max_arr[1] * max_arr[max_arr.length - 1];
        int case2 = max_arr[max_arr.length - 1] * max_arr[max_arr.length - 2] * max_arr[max_arr.length - 3];
        return Math.max(case1, case2);
    }
}
