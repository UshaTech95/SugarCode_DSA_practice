package practice.linkedlist2;

public class generatelinkedlist {

    public static linknode createLinklist(int[] arr) {
        linknode head= new linknode(arr[0]);
        linknode temp= head;
        for (int i = 0; i < arr.length; i++) {
            temp.next= new linknode(arr[i]);
            temp= temp.next;
        }
        return head;
    }
    public static void printLinkedlist(linknode head){
        linknode temp= head;
        while(temp!=null){
            System.out.print(temp.val + "------>");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
