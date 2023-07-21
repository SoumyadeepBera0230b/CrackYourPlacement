package Strings;

public class print_all_dublicates_in_string {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        findDublicate(s);

    }

    public static void findDublicate(String s) {
        int ch[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[(int) s.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > 1) {
                System.out.println("Count[\'" + (char) (97 + i) + "\'] = " + ch[i]);
            }
        }
    }
}