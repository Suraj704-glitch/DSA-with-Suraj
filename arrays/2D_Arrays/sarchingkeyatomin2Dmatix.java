
import java.util.*;

public class sarchingkeyatomin2Dmatix {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                 if(matrix[i][j]==key){
                    System.out.println("found the cell" +"(" + i + ',' + j + ")");
                    return true;
                 } 
            }
    }
    System.out.println("Key not found" );
        return false;
}
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;//   ye Rows ki liye
        int m=matrix[0].length;//  ye coulm ki liye
        //for input
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                System.out.print("Enter your element in matrix : ");
                matrix[i][j]=sc.nextInt();
            }
        } 
        //for print
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
               System.out.print( matrix[i][j]);
            }
            System.out.println();
      }
      search(matrix,5);
}
}