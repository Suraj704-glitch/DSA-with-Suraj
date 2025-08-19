public class DioganalSum {//0(n^2)
    public static int matrix(int matrix[][]) {
        int sum=0;
        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                sum+=matrix[i][j];
                
            }
            else{
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
    }
    return sum;
}
public static int most_prefer_method(int matrix[][]){//0(n)
   int sum=0;
    for(int i=0; i<matrix.length; i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i){// i+j==matrix.length
            sum+=matrix[i][matrix.length-1-i];
        }
    }
    return sum;
}
public static void main(String[] args) {
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
   System.out.print(matrix(matrix));
   System.out.println();
   System.out.print(most_prefer_method(matrix));
}
}
