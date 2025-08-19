public class Gridway {
    public static int Gridway(int i,int j,int n,int m){
        // Base Case
        if(i==n-1&&j==m-1){  // jb hum last pr phuch jaye
            return 1;
        }
        else if(i==n||j==m){ // jb hum Grid se bahr chale jaye

            return 0;
        }

        // for right movement
        int w1= Gridway( i , j+1,n, m);

        // for right  movement
        int w2= Gridway( i+1, j,n, m);

       return (w1+w2);
    }
    public static void main(String [] args){
        int n=3,m=3;
        
        System.out.println( "total Number of way is :" +Gridway( 0, 0,n, m));
    }
}
