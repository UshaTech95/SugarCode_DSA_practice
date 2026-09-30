package practice.linkedlists;

public class GenerateLinkedList {

    public static LinkNode CreateLL(int[] arr){
        LinkNode head= new LinkNode(arr[0]);
        LinkNode temp=head;
        for (int i=1; i< arr.length; i++){
            temp.next= new LinkNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void printLL(LinkNode head){
        LinkNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + "--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
