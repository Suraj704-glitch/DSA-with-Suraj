public class s_name {
    public static void s(int n){
        for(int i=1; i<=n; i++){
            //inneer loop 
            for(int j=1; j<=n; j++){
                // if((i%2 !=0)||(i==2&&j==1)||(i==(4)&&j==(5))){
                //     System.out.print("*"+" ");
                // }
                // else{
                //     System.out.print(" ");
                // }
                if((i==2&&j>1)||(i==4&&j<5)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" "+"*");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //s(5);
    }
    
}
