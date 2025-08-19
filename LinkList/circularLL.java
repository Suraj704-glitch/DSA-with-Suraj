public class circularLL {
    public class Node {
     int data;
     Node next;
     Node(int data) {
        this.data = data;
        this.next = null;
     }
   }
     public static Node head;
     public static Node tail;
     public  static int size;

    
     public void insertAddFirst(int data){ 
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            newNode.next=head;
            return;
        }
        else{
        newNode.next=head;
        head=newNode;
        tail.next=head;
        }
     }

     // insert at end 
     public void addEnd(int data){
      Node newNode=new Node(data);
      size++;
      if(head==null){
         head=tail=newNode;
         newNode.next=head;
         return;
      }
      newNode.next=head;
      tail.next=newNode;
      tail=newNode;// for doing last addition ;
     }

     // ADD at specific posion 
     public void addSpecificPosi( int item,int data){
      Node newNode=new Node(data);
      size++;
      if(head==null){
         head=tail=newNode;
         newNode.next=head;
         return;
      }
      Node temp=head.next;
      int i=0;
      while(temp.data!=item){
         temp=temp.next;
      }
      newNode.next=temp.next;
      temp.next=newNode;

     }
         // Delete Node from beging;
     public int det_Begi(){
      if(head==null){
         System.out.println("CLL are Empty");
         return -1;
      }
      if(size==1){
         int val=head.data;
         head=tail=null;
         size=0;
         return val;
      }
      int val=head.data;
      head=head.next;
      tail.next=head;
      size--;
      return val;

     }

     //Delete at end posion 
     public void delAtEnd(){
      if(head==null){
         System.out.println("CLL are Empty");
         return ;
      }
      if(size==1){
         //int val=head.data;
         head=tail=null;
         size=0;
         return  ;
      }
      Node temp=head.next;
      while(temp.next.next!=head){
         temp=temp.next;
      }
     // int val=temp.next.data;
      temp.next=head;
      size--;
      return  ;
     }

     // prinln
     public void prinln(){
      if(head==null){
         System.out.println("CLL is empty");
         return;
      }
      System.out.print(head.data+"->");
        Node temp=head.next;
        
        while(temp!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
     }
 public static void main(String[] args) {
    circularLL list=new circularLL();
    list.insertAddFirst(1);
    list.insertAddFirst(2);
    list.insertAddFirst(3);
    //list.prinln(); // will print 3->2->1
    list.addEnd(5);
    list.prinln(); 
    list.addSpecificPosi(2,9);
    list.prinln(); 
    list.det_Begi();
    list.delAtEnd();
    list.prinln(); 
 }
}
