package LinkedList;

public class palindrome_linkedList {

    public boolean isPalindrome(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        // Finding the middle element
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the elements from middle where slow is present to the end of the
        // linked list

        LinkedList.Node prevNode = slow;
        LinkedList.Node currentNode = slow.next;
        prevNode.next = null;
        while (currentNode != null) {
            LinkedList.Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        // Now comparing the first element with the last element
        fast = head;
        currentNode = prevNode;

        while (currentNode != null) {
            if (fast.data != currentNode.data) {

                return (false);
            }
            fast = fast.next;
            currentNode = currentNode.next;
        }
        return (true);

    }
}
