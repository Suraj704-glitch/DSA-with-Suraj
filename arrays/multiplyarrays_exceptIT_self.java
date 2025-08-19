public class multiplyarrays_exceptIT_self {
    public static void multiply(int matrix[]){
        // int product=1;
        for(int i=0; i<matrix.length; i++){
            int product=1;
            for(int j=0;j<matrix.length; j++){
                if(i!=j){
                    product*=matrix[j];
                }
                // System.out.println(product);
                // else{
                //     continue;
                // }
            }
            System.out.println(product);
        }
        // return product;
    }

    public static void main(String[] args) {
        int matrix[]={2,4,3,6,7,8};
        // System.out.println(multiply(matrix));
        multiply(matrix);
    }
}
