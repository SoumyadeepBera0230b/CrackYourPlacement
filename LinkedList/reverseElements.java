package LinkedList;

public class reverseElements {
    public LinkedList.Node reverseList(LinkedList.Node head) {
        LinkedList.Node previousNode = null;
        LinkedList.Node currentNode = head;

        while (currentNode != null) {
            LinkedList.Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
