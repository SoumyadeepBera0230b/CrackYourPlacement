public class majority_element {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 2, 1, 2, 2, 1, 1 };
        int ans = majority(arr);
        System.out.println(ans);

    }

    public static int majority(int n[]) {
        int count = 0;
        int current_element = 0;

        for (int i = 0; i < n.length; i++) {
            if (count == 0) {
                current_element = n[i];
            }

            if (current_element == n[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return current_element;

    }
}