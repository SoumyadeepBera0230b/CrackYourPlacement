
public class is_palindrome_number {
    public static void main(String[] args) {
        int num = -121; // -121 false
        boolean result = isPalindrome(num);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        int y = x;
        if (x < 0) {
            return false;
        }

        int res = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            res = (res * 10) + rem;
            x = x / 10;

        }

        if (res == y) {
            return true;
        }
        return false;
    }
}
