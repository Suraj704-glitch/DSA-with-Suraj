public class compair_String {
    public static void main (String[] args){
        String S1="Suraj";
        String S2="Suraj";
        String S3=new String("Suraj");
        if(S1==S2){
            System.out.println("String are equal");

        }
        else{
            System.out.println("String are not equal");
        }
        if(S1.equals(S3)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}
