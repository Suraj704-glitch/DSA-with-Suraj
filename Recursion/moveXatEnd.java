public class moveXatEnd {
    public static void moveatend(String str,int idx,int count,String newstr){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newstr+="x";
               
            }
            System.out.print(newstr);
            return;
        }
        char charec=str.charAt(idx);
        if(charec=='x'){
            count++;
            moveatend( str, idx+1, count, newstr);
        }
        else{
            newstr+=charec;
            moveatend( str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str="axbcxx";
        moveatend( str, 0, 0, " ");
    }
}
