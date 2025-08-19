public class SubString {
    public static  void findstring(String str,String ans, int i){
        // base
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
         //Recursion 
         //chose Yes
         findstring( str, ans+str.charAt(i), i+1);
         //chose no
         findstring( str, ans,i+1);

    }


    // String Bulder 
    public static void findStringIn(String str,StringBuilder sb,int i){
      //  base case
        if(i==str.length()){
        
                System.out.println(sb.length()==0?"null":sb);
          ///  }
         return;
        }

        //recursion if chose yes
       StringBuilder newsb = new StringBuilder(sb);

        findStringIn(str, newsb.append(str.charAt(i)), i + 1);

        // if chose No
        // sb.deleteCharAt(i);
        findStringIn( str, sb, i+1);
             
    }

    public static void main(String[] agrs){
        String str="abc";
        
        findstring( str,  "",0);

        //for string bulder
        findStringIn( str,new StringBuilder() , 0);
    }
}
