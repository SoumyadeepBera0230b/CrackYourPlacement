
public class missing_number {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 3 }; // 2 is missing
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        int cnt[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]] += 1;
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}