public class sortedpath_Direction {
        public static float direction(String path){
            int x=0,y=0;
         for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
         }
         int X1=x*x;
         int Y1=y*y;
         return (float)Math.sqrt(X1+Y1);
        }


    public static void main(String[] args) {
        String path="WNEENESENNN";
System.out.print(direction (path) );
    }
}
