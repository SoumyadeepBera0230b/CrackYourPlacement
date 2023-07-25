import java.util.*;

public class product_array {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 5, 6, 2 };
        Solution s = new Solution();
        ArrayList<Integer> res = s.productExceptSelf(arr);
        System.out.println(res);
    }
}

class Solution {
    public ArrayList<Integer> productExceptSelf(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        // for loops T.C - O(n)
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            a.add(product);
        }
        return (a);
    }
}