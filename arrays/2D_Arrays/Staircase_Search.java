public class Staircase_Search {
    public static boolean isStaircase(int matrix[][], int key){// ye  top corner ki liye 
        int row=0, col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("cell is found ; ("+ row+","+ col +")");
                return true;
            }
            else if(matrix[row][col]>key){//move left
                col--;
                }     
                else{//move bottem
                    row++;
                }       
            }
            System.out.println(" cell not found ");
            return false;
        }
        public static boolean issStaircase(int matrix[][], int key){
            int  row=matrix.length-1, col=0;
            while(row>=0&&col<matrix[0].length){
                if(matrix[row][col]==key){
                    System.out.println("cell is Found  : (" + row +","+col+")");
                    return true;
                }
                else if(matrix[row][col]>key){
                    row--;
                }
                else{
                    col++;
                }
            }
            System.out.println("cell not Fount :");
            return false;
        }
    public static void main(String[]args ){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                         {32,33,39,50}};
        isStaircase(matrix,33);
        issStaircase(matrix,35);
    } 
}
