public class findlengthOfString {
    public static void  length(String str ,int count,int idx){
        if(idx==str.length()){
        System.out.print("Length of String is : "+ count);
           return ;
        }
        //count++;
        length( str , count+1,idx+1);
    
      }
        public static void main(String[] args) {
            String str="abcd";
            length( str ,0,0);
        }
}
