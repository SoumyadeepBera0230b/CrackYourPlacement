import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> sum(int arr[], int target) {

        List<List<Integer>> ans = new ArrayList<>();
        // [-1, 0, 2, 0, -1, 1] 0
        Arrays.sort(arr);

        // [-1, -1, 0 , 0, 1, 2]

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int current_sum = arr[i] + arr[j] + arr[k];

                if (current_sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);

                    j += 1;
                    k -= 1;
                    while (j < k && arr[j] == arr[j + 1]) {
                        j += 1;
                    }

                    while (j < k && arr[k] == arr[k - 1]) {
                        k -= 1;
                    }

                }

                else if (current_sum < target) {
                    j += 1;
                } else {
                    k -= 1;
                }
            }
        }

        return ans;

    }

    public static void main(String args[]) {
        int ans[] = { -1, 0, 1, -1, 0, 2 };
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();
        res = sum(ans, target);
        System.out.println(res.toString());
    }
}
