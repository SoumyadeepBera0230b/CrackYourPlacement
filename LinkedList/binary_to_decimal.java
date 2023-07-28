package LinkedList;

public class binary_to_decimal {
    public void decimal(LinkedList.Node head) {
        int num = 0;
        while (head != null) {
            num = (num * 2) + head.data;
            head = head.next;
        }
        System.out.println(num);
    }
}
