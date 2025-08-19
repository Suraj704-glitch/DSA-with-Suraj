public class Circulae_queue {
    static class CQueue{
       static int arr[];
       static int size;
       static int rear;
       static int front;
        CQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size ==front; 
        }
        // add 
        public static void add(int data){ //0(1)
            if(isFull()){
                System.out.println("Cqueue is full");
                return ;
            }
            if(front==-1){// when add 1st element 
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // remove
        public static int remove(){ //0(1)
            if(isEmpty()){
                System.out.println("Cqueue is Empty");
                return -1;
            }
            int val=arr[front];
            
            // last element remove
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }

            return val;
        }
        // peek
        public static int peek(){// 0(1)
            if(isEmpty()){
                System.out.println("Cqueue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CQueue cq=new CQueue(3);
        cq.add(3);
        cq.add(2);
        cq.add(8);
        System.out.println("remove element from cq");
        System.out.println(cq.remove());// front se remove ho gya
        cq.add(4);
        System.out.println(cq.remove());// front se remove ho gya
        cq.add(5);
        System.out.println(cq.remove());// front se remove ho gya
        cq.add(6);
        System.out.println("remain in cq");
        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }

    }
}
