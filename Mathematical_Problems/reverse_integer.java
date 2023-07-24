public class reverse_integer {
    public static void main(String[] args) {
        int n = 1233453535;
        int ans = reverse(n);
        System.out.println(ans);
    }

    public static int reverse(int x) {
        int y = x;
        if (x < 0) {
            y = (-1) * x;
        }

        long res = 0;
        while (y > 0) {
            int rem = y % 10;
            res = (res * 10) + rem;
            y = y / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        if (x < 0) {
            res *= (-1);
        }
        return (int) res;

    }
}