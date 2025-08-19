
public class LinkedList {
    // Create a Node 
     public static class Node{
        int data;
        Node next;
        // Make a  Costructor 
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

       // Assign Head and Tail; 
        public static Node head;
        public static Node tail;
        public static int  size; 
    
        // Addition of Node;
        public void addfirst(int data){
            // Step 1. Creatre Newnode
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            //Step2. newnode next=head;
            newNode.next=head;
            // Step3. head= newnode;
            head=newNode; 
        }
    // ADD Last IN LinkedList 
    public void addlast(int data){
        // create new Node'
        Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // ADD ANy Index
    public void add(int idx, int data){ //0(1)
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while( i<idx-1){
            temp=temp.next;
            i++;
        }
        // i==idx-1 ; temp->prev;
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // Remove first
    public static int  remfirst(){ // 0(1)
        if(size==0){//(head==null)
            System.out.println("LikedList is Empaty");
            return Integer.MIN_VALUE;
        }
        else{
            if(size==1){ //(head.next==null)
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // Remove in Last In LinkList; (TC = 0(n))
    public int remEnd(){

        if(size==0){//( head==null)
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;
        }
        if(size==1){ //(head.next==null)
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
         // remove last NOde of LL
         Node temp=head;
         for(int i=0;i<size-2;i++){
            temp=temp.next;
         }

        // // ya to yese bhi kr sakte hai

        //  while(temp.next.next!=null){
        //  temp=temp.next;
        //  }


         int val=temp.next.data;
         temp.next=null;
         size--;
         return val;
         
         
        
    }


    // SEARCH Key In LinkedList;
     public int itesearch(int key){ //0(n)

        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){// Check and Key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        // if Key not found;
        return -1;
     }
    
     // RECURSIVE FUNCTION
     public int healper(Node head,int key){ // healper function because recursion li liye Node requir hoti hai 
        if(head==null){                      
            return -1;
        }
        if(head.data==key){
            return 0;
        }

        int idx=healper( head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
     }
        public int recursiveSearch(int key){// only key pass hogi
           return healper(head,key) ;
        }


        // Revers of a LinkedList
        public void revLL(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
             
            while(curr!=null){
                next=curr.next;
                curr.next=prev;  // recursive step;
                prev=curr;
                curr=next;

            }
            head=prev;

        }
 // Remove Nth Node From End AND Starting se (size-n+1) hoga ;
        public void remove_Nth_Node_from_End(int n){
            //for size calculation
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }


            if(n==sz){
                     head=head.next;
                     return ;
                     }
                     // hme sz-n; idx tk phuchna pdega;
            Node prev=head;
            for(int i=1; i<sz-n; i++){// i=1; se start kiya is liye i<sz-n only kiya 
                prev=prev.next;       // if i=0; se start kiyz jaye to i<sz-n-1 krenge 
            }
           
            prev.next=prev.next.next;
            return;
        }
        


        // CHECK LINKEDLIST Are Palindrom 
       
        // Find Mid Node 
        // Slow Fast Approch

        public Node find_Mid(Node head){

            Node slow=head;
            Node fast=head;
              while(fast!=null && fast.next!=null){
                 slow=slow.next; // +1
                 fast=fast.next.next; // +2
              }
              return slow; // slow is my mid Node And they was also first node of rightHalf 
        }

        public boolean checkpalindrom(){
            if(head==null || head.next==null){
                System.out.println("LinkedList are Autometacally palindrom");
                 
            }
            // step 1 To find mid
               Node midNode =find_Mid(head);
            //step 2 Reverse 2nd halp palindrom
            Node prev=null;
            Node curr=tail=midNode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            // head=prev;

            //step 3 check [palindrom]

            Node left=head; // 1st Half ka head Node 
            Node right=prev; // 2nd half ka head Node 
           while(right!=null){
            if(left.data!=right.data){
                
                return false;
            }
                left=left.next;
                right=right.next;
           }
           return true;
            
            }
            
        
// MERGE SORT OF LINKEDLIST/
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
       Node newleft=head;
       Node newright=rightHead;

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
           System.out.print(temp.data);
            temp=temp.next;
       }
   }


    // Print LinkedList 
    public void printLL(){ // 0(n)
         if(head==null){
            System.out.println("LinkedList are Empty");
         }
         Node temp=head;
          while(temp!=null){
         System.out.print(temp.data + "->");
         temp=temp.next;
          }

          System.out.println("null");
    }

    
    public static void main(String []args){
        LinkedList ll=new LinkedList();
        ll.addfirst(2);
       
        ll.addfirst(1);
        
        ll.addlast(4);
       
        ll.addlast(9);
      
        ll.add(2,3);

        ll.printLL();// 1->2->3->4->9->null;
       // System.out.println("Size of LinkedList -> " +ll.size);
    //    System.out.println(  ll.remfirst()); // ye remove value ko print krwa dega
    //    ll.remfirst();
    //    ll.printLL();
        // ll.remEnd();
        // ll.printLL();

        // System.out.println(ll.itesearch(3));

        // System.out.println(ll.itesearch(10));
         
       // System.out.println(ll.recursiveSearch(4));

    //    ll.revLL(); 
    //    ll.printLL();
   //  System.out.println(ll.checkpalindrom());
   // ll.remove_Nth_Node_from_End(2);
    ll.printLL();
    
   
    }
}

