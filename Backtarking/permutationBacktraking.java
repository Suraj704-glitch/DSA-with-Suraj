public class permutationBacktraking {
    
    public static void permu(String str,String ans ){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
          
          
        for(int i=0;i<str.length(); i++){// ye hr string ko 
            char curr=str.charAt(i);
             String newStr=str.substring(0,i) +  str.substring(i+1);// remove for current element

             permu( newStr, ans+curr );

        }
    }

    
    // by Stringbuilder



    public static void permubySb(String str,StringBuilder sb){
        if(str.length()==0){

            System.out.println(sb);
            return;
        }
            for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
                StringBuilder newSb=new StringBuilder(sb);
            permubySb( newstr, newSb.append(curr));

        }
    }
    public static void main(String[] args) { 
        String str="abc";
        permu(str, "");
        System.out.println();
        permubySb( str,new StringBuilder (""));
    }
}
