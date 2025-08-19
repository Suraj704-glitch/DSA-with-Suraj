public class Spiralmatrix {
    public static void Spiral(int matrix [][]){
        //spiral mi print krna hai 
       
        
        int startRow=0;
        int startcolm=0;
        int endRow=matrix.length-1;
        int endcolm=matrix[0].length-1;
        while(startcolm<=endcolm&&startRow<=endRow){
            //top  ,esmi row commen hai;
      for(int i=startcolm; i<=endcolm; i++){
        System.out.print(matrix[startRow][i] +" ");
      }
      //right wala
      for(int i=startRow+1; i<=endRow; i++){
        System.out.print(matrix[i][endcolm]+" ");
    }
    //bottem wala
    for(int i=endcolm-1; i>=startcolm; i--){
        System.out.print(matrix[endRow][i]+" ");
    }
    //left wala
    for(int i=endRow-1; i>=startRow+1; i--){
        System.out.print(matrix[i][startcolm] +" ");
    }
    startRow++;
    startcolm++;
    endRow--;
    endcolm--;
}
System.out.println();


}
   
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        Spiral(matrix);
                       // printer(matrix);
    }
    
}
