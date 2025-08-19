public class SudokuSolver {
    public static boolean issafe(int sudoku[][],int row,int col,int digit){
        //  col mi ckeck kro
        for(int i=0; i<9;i++){
           if (sudoku[i][col]==digit){
            return false;
           }
        }
        // row mi ckeck kro 
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
        }
    }
    // Grid(3X3) mi ckeck kro
    int sr=(row/3)*3;
    int sc=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(sudoku[i][j]==digit){
                return false;
            }
        }
    }
    return true;
    }
    public static boolean issudoku(int sudoku[][],int row,int col){

        // Base case
        if(row==9){ /// when target achive
            return true;
        }
       

        //Recursion kam
        int nextrow=row;
        int nextcol=col+1;
        // ydi 1st row full ho jaye
        if(col+1==9){ 

            nextcol=0;
            nextrow=row+1;
        }
        // if koi eliment phle se place ho to move to next element
        if(sudoku[row][col]!=0){
           return issudoku( sudoku, nextrow, nextcol);
        }

        // for place digit 
         for(int digit=1;digit<=9;digit++){  
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
              if(issudoku( sudoku, row, nextcol)){
                return true;
              }
              sudoku[row][col]=0;
            }
         }

         return false;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if( issudoku( sudoku,0,0)){
            System.out.println("Solution are exist :");
            printsudoku(sudoku);
        }
        else{
            System.out.print("Solution does not exist");
        }
        
    }
}
