public class buy_sell_stoke {
    public static int stoke(int price[]){
        int min =  Integer.MIN_VALUE;// YE - INFINITY  KI LIYE
        int buyprice[]=new int [price.length];
         buyprice[0]=price[0];
        for(int i=1; i<price.length; i++){
            
            buyprice[i]=Math.min(buyprice[i-1],price[i]);
           int profit=price[i]-buyprice[i];
            //  min=Math.max(profit,min);
            if(min<profit){
                 min=profit;
             }

        }
        if(min<0){
            return 0;
        }
        return min;  
        }
    
    //m othermethode bynsarada kapara
    public static int buyandsell(int price[]){
        int buyprice=Integer.MAX_VALUE;//+infinity
        int maxprofit=Integer.MIN_VALUE;//-infinity
        for(int i=0; i<price.length; i++){
            if( buyprice[i] < price[i] ){//for profit 
               int profit=price[i]-buyprice[i];
                maxprofit=Math.max(maxprofit,price[i]);
            }
            else{
                buyprice[i]=price[i];
            }
        }
        return maxprofit;
    }


        public static void main (String args []){
             int price []={7,1,5,3,6,4};
             //System.out.println( "Our profit of stoke is : " +stoke(price));
             System.out.println(buyandsell(price)); 
             }
        
}
