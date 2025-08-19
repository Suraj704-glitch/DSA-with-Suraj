public class RotateAT90degree {
    public static void rotate(int matrix [][]){
        int rowend=matrix.length-1;
        int col=0;
        int tepmatrix[][]=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length; i++){
            for(int j=0; j<matrix.length;j++){
               System.out.print((tepmatrix[i][j]=matrix[rowend-j][col+i] )+" "); 
            }
            System.out.println();
        }

    }
    public static void main (String[]args){
        int matrix[][]={{1,2,3},
                         {4,5,6},
                         {7,8,9} };
                         rotate( matrix);      
    }
}
