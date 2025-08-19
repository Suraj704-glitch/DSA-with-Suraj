
public class binarry_search {
    public static int search(int number[],int key){
        int start=0, end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
               return mid; //System.out.print(mid);
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int number[]={2,4,6,8,10};
        int key =8;
       int index= search( number, key);
System.out.print("INDEX :" + index);
    }
}
