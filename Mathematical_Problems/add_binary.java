public class add_binary {
    public static void main(String[] args) {
        String a = "100";
        String b = "10";
        String ans = addBinary(a, b);
        System.out.println(ans);
    }

    public static String addBinary(String n, String m) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = n.length() - 1;
        int j = m.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += n.charAt(i) - '0';
                i -= 1;
            }

            if (j >= 0) {
                sum += m.charAt(j) - '0';
                j -= 1;
            }
            sb.append(sum % 2);
            System.out.println("The string builder has" + sb);
            carry = sum / 2;

        }
        return sb.reverse().toString();

    }
}
