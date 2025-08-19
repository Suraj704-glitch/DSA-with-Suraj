public class buyandsellstoke {
    public static int buyandsell(int price[]){
        int buyprice=Integer.MAX_VALUE;//+infinity
        int maxprofit=Integer.MIN_VALUE;//-infinity
        for(int i=0; i<price.length; i++){
            if( buyprice < price[i] ){//for profit 
               int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit,price[i]);
            }
            else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
    int price[]={7,1,5,3,6,4};
    System.out.println( buyandsell(price) );   
    }
}
