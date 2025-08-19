    import java.util.*;
public class starpattern {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter yout number of row :");
            int colum=sc.nextInt();
            System.out.print("Enter yor numbrt of colum :");
            int row=sc.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=colum;j++){
                    if(i==1||i==row||j==1||j==colum){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
    
}
