import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> sum(int arr[], int target) {

        List<List<Integer>> ans = new ArrayList<>();
        // [-1, 0, 2, 0, -1, 1] 0
        Arrays.sort(arr);

        // [-1, -1, 0 , 0, 1, 2]
        for (int x = 0; x < arr.length - 2; x++) {
            if (x > 0 && arr[x] == arr[x - 1]) {
                continue;
            }

            for (int i = x + 1; i < arr.length - 2; i++) {
                if (i > x + 1 && arr[i] == arr[i - 1]) {
                    continue;
                }

                int j = i + 1;
                int k = arr.length - 1;

                while (j < k) {
                    int current_sum = arr[x] + arr[i] + arr[j] + arr[k];

                    if (current_sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[x]);
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
        }

        return ans;

    }

    public static void main(String args[]) {
        int ans[] = { 2, 2, 2, 2, 2 };
        int target = 8;
        List<List<Integer>> res = new ArrayList<>();
        res = sum(ans, target);
        System.out.println(res.toString());
    }
}
