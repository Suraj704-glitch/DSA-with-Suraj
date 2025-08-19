public class trapped_water {
    public static void trapped_wat(int height[]){
    
        //calcutate for leftmax  yani ek axullary arrays bnao;
        int leftmax[]=new int [height.length];
        leftmax[0]=height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
            
        }
          //calcutate for rightmax
        int rightmax[]=new int [height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
       
         
        int trapped_water=0;
        //loop trappedwater=0;
        for(int i=0; i<height.length; i++){
            //warerleaval=min(leftmax,rightmax);
            int waterleval=Math.min(leftmax[i],rightmax[i]);
                //trappedwater+=waterlevale-hight[i];
            trapped_water+=waterleval-height[i];
        }
        System.out.println("trappred water in aray height is :"  + trapped_water);
     
    }


    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        trapped_wat(height);
    }
}
