import java.util.ArrayList;
import java.util.List;

public class dublicates_in_array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 1, 4, 3 };
        List<Integer> res = findDuplicates(nums);
        System.out.println(res);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int cnt[] = new int[nums.length + 1];
        List<Integer> res = new ArrayList<>(nums.length / 2);

        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]] += 1;
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 2) {
                res.add(i);
            }
        }

        return res;
    }
}
