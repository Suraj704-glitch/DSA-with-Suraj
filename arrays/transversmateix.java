public class transversmateix {
    public static void  trabsvers(int matrix[][]){
        int tepmat[][]=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(tepmat[i][j]=matrix[j][i]) ;
            }
            System.out.println();
        }
    }

    
       public static void main(String []args){
        int matrix[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9} }; 
                       trabsvers( matrix);    
       }
    
}
