import java.util.Arrays;

public class move_zeroes {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 2, 0, 4 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int start = 0;
        int startnext = start + 1;
        while (start < nums.length - 1 && startnext < nums.length) {
            if (nums[start] == 0) {
                if (nums[startnext] == 0) {
                    startnext += 1;
                } else {
                    int temp = nums[start];
                    nums[start] = nums[startnext];
                    nums[startnext] = temp;
                    start += 1;
                    startnext += 1;
                }
            } else {
                start += 1;
                startnext += 1;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}