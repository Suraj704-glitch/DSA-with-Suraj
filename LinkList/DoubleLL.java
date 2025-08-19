public class DoubleLL {
    public class Node{
        int data; 
        Node next;
        Node prev;

        public  Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     
       // ADD in double LinkedList;
    public   void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
          head=tail= newNode;
          return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
       // return head;
    }
  // ADD LAST 
  public   void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;

    }
    tail.next=newNode;
    newNode.prev=tail;
    
    tail=newNode;
  }


       // REMOVE
       public int removefirst(){
         if(head==null){
            System.out.println("DLL are are the empty"); 
            return Integer.MIN_VALUE;
       }
       if(head.next==null){
        int val=head.data;
        head=head.next;
        //head.next.prev=null;
        size=0;
        return val;
       }
       int val=head.data;
       head=head.next;
       head.prev=null;
       size--;
       return val;
    }

    // REMOVE LAST
    public int removelast(){
        if(head==null){
            System.out.println("DLL are are the empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=head.next;
           // head.next.prev=null;
            size=0;
            return val;
        }
        int val=tail.data;
        tail.prev.next=null;
        size--;
        return val;
    }
       // Println()
       public static void println(){
        if(head==null){
            System.out.println("DLL are are the empty");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print (temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
       }

       // REVERSE Of Double LinkedList;
       public   void reverse_of_DLL(){
        Node prev=null;
         Node curr=tail=head;
         Node next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
         }
         head=prev;
       }
    public static void main(String[] args){
        DoubleLL dll=new DoubleLL();
       dll.addfirst(1);
       dll.addfirst(4);
       dll.addfirst(5);
       dll.addlast(2);
       dll.addlast(8);
       dll.addlast(6);
       System.out.println(dll.size);
        dll.println();
        dll.removefirst();
        dll.removelast();
        dll.println();
        System.out.println(dll.size);
        dll.reverse_of_DLL();
        dll.println();
    }
}
