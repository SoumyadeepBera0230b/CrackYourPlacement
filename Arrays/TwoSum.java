import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int res[] = twosum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twosum(int nums[], int target) {
        int index[] = { -1, -1 };
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // index[0] = i;
        // index[1] = j;
        // return index;
        // }
        // }
        // }

        // Using Two pointers
        // T.c = O(n)

        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                index[0] = i;
                index[1] = j;
                break;
            } else if (sum < target) {
                i += 1;
            } else if (sum > target) {
                j -= 1;
            }
        }
        return index;
    }
}