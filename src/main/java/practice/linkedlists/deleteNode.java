package practice.linkedlists;

public class deleteNode {
    public static LinkNode Delete(LinkNode head, int pos){
        LinkNode temp= head;
        if(pos==0){
            head=head.next;
//            doubt here
            temp.next=null;
            return head;
        }
        else {
            int count=1;
            while(count<pos && temp.next!=null){
                temp=temp.next;
                count++;
            }
            if(temp.next!=null){
                temp.next=temp.next.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        LinkNode head = GenerateLinkedList.CreateLL(arr);
        GenerateLinkedList.printLL(head);

        LinkNode newHead = Delete(head, 4);
        System.out.println("after deleting ");
        GenerateLinkedList.printLL(newHead);
    }

}
