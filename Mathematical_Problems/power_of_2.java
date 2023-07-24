public class power_of_2 {
    public static void main(String[] args) throws Exception {
        int n = 16;

        if ((n & (n - 1)) == 0 && n > 0)
            System.out.println("Yes the number " + n + " is power of 2");
        else
            System.out.println("No the number " + " is not the power of 2");
    }
}