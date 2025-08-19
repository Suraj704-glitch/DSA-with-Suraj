    import java.util.*;
public class newcode {
    public static  boolean isEven(int num){
    if(num%2==0){
        return true;
    }else {
        return false;
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isEven(n)){
        System.out.println("Even Number ");
    }
    else{
        System.out.println("Odd number ");
    }

}
}
