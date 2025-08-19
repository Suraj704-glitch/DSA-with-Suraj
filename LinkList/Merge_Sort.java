import java.util.LinkedList;
public class Merge_Sort {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // find midNode
    public static Node findMid(Node head){
         Node slow=head;
         Node fast=head.next;
        while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
        }
        return slow;

    }


    public Node mergeSort(Node head){ //0(nlog(n))
        if(head==null||head.next==null){
            return head;
        }
        // GetMid
        Node mid=findMid(head);

        // left and right LIST
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft=mergeSort( head);
        Node newright=mergeSort(rightHead);

        // Merge Both Head
        return merge(newleft,newright);
    }

    // merge both left and right list
    public Node  merge(Node head1, Node head2){

        Node merge=new Node(-1);
        Node temp=merge;
        while(head1!=null&& head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            
            temp=temp.next;
        }
        while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
    }
    return merge.next;
    }

    // println
    public static void print(){
        if(head==null){
            System.out.println("LL are emoty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
             temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        Merge_Sort list=new Merge_Sort();
        list.head=new Node(2);
        list.head.next=new Node(8);
        list.head.next.next=new Node(5);
        list.head.next.next.next=new Node(3);
        list.print();
        list.head=list.mergeSort(list.head);
        list.print();

    
      
         
       
       
        
        

    }
}
