

public class subString {
    public static String subtsring11(String str , int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str="HelloWorld";
       System.out.println(str.substring(0,5));  // java ka ye apna subarray hota hai
       //System.out.print(subtsring11 (str,0,5) );// ese hum ni kud se bnaya hai
    }
}
