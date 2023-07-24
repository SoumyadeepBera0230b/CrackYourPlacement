public class excel_sheet_colm {
    public static void main(String[] args) {
        Solution ans = new Solution();
        String res = ans.convertToTitle(30);
        System.out.println(res);
    }

}

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber -= 1;

            char c = (char) (columnNumber % 26 + 'A');
            sb.append(c);

            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}