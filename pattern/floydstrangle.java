public class floydstrangle {
    public static void incressnum(int row){
        int num=0;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                num+=1;
                System.out.print(num);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        incressnum(4);
    }
    
}
