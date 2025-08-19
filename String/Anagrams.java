public class Anagrams {
    public static Boolean  compare(String str1, String str2) {
        
        for(int i=0; i<str1.length(); i++){
             
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)!=str2.charAt(j)){
                   return false;

                    
                    
                }
                
                 
            }
           
        }
        return true;


        
    }

   

        

    }
    public static void main(String[] args) {
        String str1="care";
        String str2="race";
       System.out.print( compare(str1,str2));

    }
}
