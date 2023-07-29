package LinkedList;

public class myLL {
    public static Node head;
    public static int size;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;

    }

    public void addLast(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }

    public void delete() {
        if (head == null)
            return; // if empty or first
        head = head.next;
        size -= 1;
    }

    public void deleteLast() {
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size -= 1;
    }

    public void show(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public void length() {
        System.out.println("\nSize of the linkedlist is: " + size + " nodes");
    }

    public static void main(String args[]) {
        myLL list = new myLL();
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(10);
        list.add(15);
        list.add(12);
        list.show(head);
        list.length();
        // binary_to_decimal bd = new binary_to_decimal();
        // bd.decimal(head);
        // palindrome_linkedList pa = new palindrome_linkedList();
        // boolean bol = pa.isPalindrome(head);
        // System.out.println(bol);
        // removeDublicates rd = new removeDublicates();
        // Node ans1 = rd.removeDub(head);
        // list.show(ans1);
        // list.show(head);
        // reverseElements r = new reverseElements();
        // Node res = r.reverseList(head);
        // list.show(res);
        // middleElement me = new middleElement();
        // Node ans = me.midElement(res);
        // list.show(ans);
        delete_node_having_greater_value_on_right d = new delete_node_having_greater_value_on_right();
        Node ans2 = d.compute(head);
        list.show(ans2);

    }

}
