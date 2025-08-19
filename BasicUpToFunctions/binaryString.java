public class binaryString {
    public static void printbin(int n ,int lastplace,String str){
            //base case
            if(n==0){
                System.out.println(str);
                return;
            }
        //kaam
        printbin( n-1, 0, str+"0");
        if(lastplace==0){
            printbin(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args){
        printbin(3,0," ");
    }
}
