public class peak_element_index {
    public static void main(String[] args) {
        int arr[] = { -2147483648, -2147483647 };
        Solution res = new Solution();
        System.out.println(res.findPeakElement(arr));
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int current_sum = nums[0];
        int overall_sum = nums[0];
        int index = 0;

        int i = 0;
        while (i < nums.length) {
            if (current_sum < nums[i]) {
                current_sum = nums[i];
            }

            if (overall_sum < current_sum) {
                System.out.println(overall_sum);
                overall_sum = current_sum;
                index = i;
            }
            i += 1;
        }
        return index;

    }
}
