package practice.linkedlists;

public class InsertNode {
    public static LinkNode insert(LinkNode head, int val, int pos) {
        LinkNode newNode = new LinkNode(val);
        LinkNode temp = head;
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            int count = 1;
            while (count < pos && temp.next != null) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        LinkNode head = GenerateLinkedList.CreateLL(arr);
        GenerateLinkedList.printLL(head);

        LinkNode newHead = insert(head, 10, 4);
        System.out.println("adding new ");
        GenerateLinkedList.printLL(newHead);
    }
}
