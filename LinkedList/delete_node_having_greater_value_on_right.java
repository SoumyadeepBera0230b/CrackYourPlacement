package LinkedList;

public class delete_node_having_greater_value_on_right {
    public static LinkedList.Node compute(LinkedList.Node head) {

        // 12 -> 15 -> 10 -> 11 -> 2 -> 3
        Node currentNode = head;

        while (currentNode.next != null) {
            if (currentNode.data < currentNode.next.data) {
                currentNode.data = currentNode.next.data;
                currentNode.next = currentNode.next.next;
                currentNode = head;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
