public class String_Builder {
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);

        }
        System.out.print(sb +" And length od String Builder is :  " + sb.length() );
    }
}
