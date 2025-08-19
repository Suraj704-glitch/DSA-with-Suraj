    import java.util.*;

public class fever {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double temp =sc.nextDouble();
        if(temp>=98.6){
            System.out.println("fever");

        }
        else{
            System.out.println("not fever");
        }

    } 
}
