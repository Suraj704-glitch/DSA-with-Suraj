import java.util.*;
public class Indian_Coin {
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,200,500,2000};
        int amount =9650;
        int countOfcoin=0;
        // Sort in Deccending Order

        Arrays.sort(coin,Comparator.reverseOrder());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coin.length;i++){
            if(coin[i]<=amount){

                while(coin[i]<=amount){
                    ans.add(coin[i]);
                    amount-=coin[i];  
                    countOfcoin++;
                }
            }
        }
        System.out.println("Maximum Number of coin use = " +countOfcoin);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " " );
        }
    }
}
