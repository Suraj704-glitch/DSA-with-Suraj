public class LinkedList_part2{
    
    // blue print of node 
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
 
    // Detect to LinkedList are Cyclic/Loop or not 
    public static boolean to_find_Cyclic_LL(){
        Node slow=head;
        Node fast=head;

        while(fast!=null &&fast.next!=null){

            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true; // Cycle exist
            }
        }
        return false; // cycle not exist;
    } 


    // Removing Cycle/ Loop form LikedList;
    public static void remove_Cycle(){
        // Detect Cycle
        Node slow=head;
        Node fast=head;
         boolean cycle=false;
         while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return ;
        }
        // find meeting point 
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;//+!
            prev=fast;
            fast=fast.next;//+1
        }
         // remove cycle
         prev.next=null;
        
    }

 // find mid which are 1st last
    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // ZIG ZAG 
    public static void zig_zag(){

        // find mid which are 1st last
        Node midNode=getMid(head);
       
        // reverse of 2nd half
      Node prev=null;
      Node curr=midNode.next;
      Node next;
      midNode.next=null;// 1st half
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      }
     Node rightHead=prev; // head of 2nd half;
       
        // arrange in zig zag form
        Node LH=head;
        Node RH=rightHead;
        Node nextL,nextR;
        while(LH!=null&&RH!=null){
            // this four line for zig-zag
            nextL= LH.next;
            LH.next=RH;
            nextR=RH.next;
            RH.next=nextL;
            // two line are apdation ;
            RH=nextR;
            LH=nextL;

        }
    }

    // Print LinkedList
    public static void printll(){
        if(head==null){
            System.out.println("LL is empty");
            return ;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data +"->");
               temp=temp.next;
            }
            System.out.println("null");
            
    }
    
    public static void main(String [] args){
        
       head=new Node(1);
       head.next=new Node(2);
       head.next.next=new Node(3);
       head.next.next.next=new Node(4);

       head.next.next.next.next=head.next;
        
     System.out.println(to_find_Cyclic_LL());
     remove_Cycle();
     
     printll();
     zig_zag();
     printll();
     
    }
    
}
