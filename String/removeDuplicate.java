

public class removeDuplicate {
    public static void  revdup(String str){
        String newstr=" ";
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                newstr+=str.charAt(i);
            }
        }
       
        newstr+=str.charAt(str.length()-1);
    
        System.out.print(newstr); 
     
      
    }
    public static void main(String[] args) {
        String str="appnnacollage";
         revdup( str);
    }
}
