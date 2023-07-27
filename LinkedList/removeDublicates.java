package LinkedList;

public class removeDublicates {
    public LinkedList.Node removeDub(LinkedList.Node head) {
        LinkedList.Node currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
