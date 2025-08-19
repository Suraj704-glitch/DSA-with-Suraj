public class Queen {

    public static boolean issafe(char board[][], int row,int col){ // ye function check kenne
                                                                // ki liye ki Queen ka polace 
                                                                // safe hai bhi ya nahi
        // check vertically up
        for(int i=row-1; i>=0;i--){
           if( board[i][col]=='Q'){
            return false;
           }
        }
        //check left dioganally up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if( board[i][j]=='Q'){
                return false;
            }
        }

        //check right dioganally up

        for(int i=row-1,j=col+1;i>=0&&j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    // ye function N-Queen ko 
                 //N Row mi baithane ki liye tha
    public static void Queentrc(char board[][],int row){

        //Base
        if(row==board.length){
            printboard(board);
            return ;
        }
        //colum loop

        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
            
            Queentrc( board, row+1); // function call
            board[row][j]='x'; // backtracking  and remove inx for assing new qween
            }


             

    }
}
public static void printboard(char board[][]){  
    System.out.println("______Checkboard_______"); 
    for(int i=0;i<board.length;i++){
        for(int j=0; j<board.length;j++){
           System.out.print( board[i][j] +" ");
        }
        System.out.println();
    }
}
    public static void main(String []args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';

            }
        }
        Queentrc( board, 0);
    
    }
}
