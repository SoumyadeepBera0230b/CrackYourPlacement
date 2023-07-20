import java.util.Arrays;

class sort_012 {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 2, 0 };
        sort_012 sort = new sort_012();
        sort.sortColors(arr);
    }

    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                // Swap
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid += 1;
                left += 1;
            } else if (nums[mid] == 1) {
                mid += 1;
            } else {
                // swap
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right -= 1;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}