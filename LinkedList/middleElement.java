package LinkedList;

public class middleElement {

    public Node midElement(Node head) {
        // int size = 0;
        // Node currentNode1 = head;
        // while (currentNode1 != null) {
        // size += 1;
        // currentNode1 = currentNode1.next;
        // }
        // int middleIndex = (size / 2);
        // Node currentNode = head;
        // int cnt = 0;
        // while (currentNode != null) {
        // if (cnt == middleIndex) {
        // head = currentNode;
        // break;
        // }
        // currentNode = currentNode.next;
        // cnt += 1;
        // }

        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        // Finding the middle element
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        head = slow;
        return head;

    }

}
