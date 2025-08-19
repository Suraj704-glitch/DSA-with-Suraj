    import java.util.*;
public class palindrome {
        public static int isPalindron(int n){
             int rev=0;
             while(n>0){
             int LD=n%10;
             rev=rev*10+LD;
             n=n/10;
                  }
                       return rev;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindron(n)==n){
            System.out.println("Palindrome  ");
        }
        else {
            System.out.println("not Palindrome");
        }

        
    }
}
