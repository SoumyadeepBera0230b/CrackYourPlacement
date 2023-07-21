public class find_the_dublicate_numb {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4 };
        int res = findDuplicate(arr);
        System.out.println(res);
    }

    public static int findDuplicate(int[] nums) {
        int cnt[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (cnt[i] > 1) {
                return i;
            }
        }
        return -1;
    }
}