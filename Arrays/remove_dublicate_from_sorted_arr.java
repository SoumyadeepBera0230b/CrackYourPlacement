import java.util.Arrays;

class remove_dublicate_from_sorted_arr {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // {1, -1, 2}
        int res = removeDuplicates(arr);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {

        int inf = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != inf)
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        nums[j] = inf;
                    }
                }
        }

        // System.out.println(Arrays.toString(nums));

        int pos = 0;
        int pos_next = pos + 1;
        int cnt = 0;
        while (pos_next < nums.length) {
            if (nums[pos] == inf) {
                if (nums[pos_next] == inf) {
                    pos_next += 1;
                } else {
                    // swap
                    int temp = nums[pos];
                    nums[pos] = nums[pos_next];
                    nums[pos_next] = temp;
                    pos += 1;
                    pos_next = pos + 1;
                }
            } else {
                pos += 1;
                pos_next = pos + 1;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != inf) {
                cnt += 1;
            }
        }
        // System.out.println("The nums are: " + cnt);
        return cnt;
    }
}