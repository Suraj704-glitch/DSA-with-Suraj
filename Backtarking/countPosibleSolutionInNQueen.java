import java.util.*;
public class countPosibleSolutionInNQueen {

    public static boolean issafe(char board[][],int row ,int col){
        // ckeck vertically up
            for(int i=row-1; i>=0; i--){
              if (board[i][col]=='Q'){
                return false;
              }
            }

        //ckeck left dioganlly up
            for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }

        //ckeck right dioganally  up 
            for(int i=row-1,j=col+1;i>=0&&j<board[0].length; i--,j++){ 
                if(board[i][j]=='Q'){
                    return false; 
                }
            }
        return true;  
    }

    static int  count =0; 
    //  if solution is posible then print the  solution 
    public static boolean nQueen(char board[][],int row){
        // Base case 
        if(row==board.length){
             count++;
            //  nprint( board);
            return  true;
        }
         for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
               if (nQueen(board,row+1)){
                return true;
               }
               board[row][j]='x';
            }
         }
         return false;
    }

   

    // FOR Print check board 
    public static void nprint(char board[][]){
        System.out.println("____Ches Board____");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

     // FOR count NUMBEER OF SOLUTION 
     public static void nQueenforCOUNT(char board[][],int row){
        // Base case 
         if(row==board.length){
            count++;
            nprint(board);
            return;
         }

         

        for(int j=0;j<board.length; j++){
             if(issafe(board,row,j)){
                board[row][j]='Q';
                nQueenforCOUNT( board, row+1);  // recursive function call
                board[row][j]='x';   // Backtaking 
             }

        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Check Board length : ");
        int n= sc.nextInt();

        char board[][]=new char [n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';

            }
        }

         // ye hai count wali ki liye
        // nQueenforCOUNT( board, 0);
        // System.out.println("No of solution is: "+ count  );

        if(nQueen(board,0)){
            System.out.println("Solution are possible :" );
          nprint(board);
        }
        else{
            System.out.println("Solution are not possible");
        }

    }
}
