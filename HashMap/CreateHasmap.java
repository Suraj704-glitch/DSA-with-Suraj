import java.util.*;



public  class CreateHasmap {
    static class HashMap<K,V>{ // (K ,V ) are generic variable 
     private class Node {
            K key;
            V value;
           public Node(K key,V value){
            this.key=key;
            this.value=value;
           }
     }
     private int  n; // number of the Node 
     private int  N; // Length of the bukets
     LinkedList<Node> bukets[];
    
    HashMap(){
        this.n=4;
        this.bukets=new LinkedList[4];
        this.N=bukets.length;
        for(int i=0; i<4;i++){
            bukets[i]=new LinkedList<>();
        }
    }

    private int hashFunction(K key){
         return Math.abs( key.hashCode())%bukets.length;
    }
    private int SearchInLL(K key,int bi){
        LinkedList<Node> ll=bukets[bi];
        int di=0;
        for(int i=0; i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
    }
    public void put(K key ,V value){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);

        if(di!=-1){
            Node node=bukets[bi].get(di);
             node.value=value ;
        }else{
            bukets[bi].add(new Node(key,value));
            n++;
        }
        double lemda=(double)n/N;
        if(lemda>2.0){
            rehash();
        }
    }
        @SuppressWarnings("Uncheck")
        private void rehash(){
            LinkedList<Node> oldbukets[] = bukets;
            bukets=new LinkedList[N*2];
            N=2*N;
            for(int i=0; i<oldbukets.length;i++){
                bukets[i]=new LinkedList<>();
            }
            // node add ---> in buckets;
            for(int i=0;i<oldbukets.length;i++){
                LinkedList<Node> ll=oldbukets[i]; 
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }

            }

        }

        public V get(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi);
            if(di!=-1){
                Node node=bukets[bi].get(di);
                return node.value;
            }
            return null;

        }
        public V remove(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi);
        if(di!=-1){
            Node node=bukets[bi].remove(di);
            n--;
             return node.value;
        }else{
            return null;
        }

        }

        public boolean containskey(K key){
            int bi=hashFunction(key);
        int di=SearchInLL(key,bi);

        if(di!=-1){

            return true;

        }
        else{
           return false;
        }

        }
        public boolean isEmpty(){
            return n==0;
        }
        
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
           // for(LinkedList<Node> ll :bukets){
                for(int i=0;i<bukets.length;i++){
                    LinkedList<Node> ll= bukets[i];
                if(ll!=null){
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            }
             return keys;
            }
           
        }

        
    

    public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();

         hm.put("India",15);
         hm.put("China",150);
         hm.put("Nepal",20);
        System.out.println(  hm.containskey("India"));
         System.out.println(hm.isEmpty());
        
         // make a Set of the Key;
         ArrayList<String> keys=hm.keySet();
         for(String k:keys){
            System.out.println("key :"+ k+" &Value :" + hm.get(k));
         }

        //  Or
        //  for(String k:hm.keySet()){
        //     System.out.println(k+hm.get(k));
        //  }

         
}
}
