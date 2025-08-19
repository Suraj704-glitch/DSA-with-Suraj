    import java.util.*;

public class taxcalculator {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int amount =sc.nextInt();
        int tax;
        if(amount<=500000){
          tax=0;
        }else if(amount>500000 && amount<=1000000){
          tax=(int) (amount*0.2f);
        }
        else {
            tax=(int) (amount*0.3f);
             }
                  System.out.println("your taxt is :"+ tax);

    }
}

       