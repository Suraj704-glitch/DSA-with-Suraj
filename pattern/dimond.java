public class dimond {
    public static void diomondpattern(int n){
        int num=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i+num); j++){
                System.out.print("*");
                
            } num++;
            System.out.println();
        }
        //for second half
         
        for(int i=n;i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i+num); j++){
                System.out.print("*");
               }
                num--;
               System.out.println();
             } 
               }
     //jo sardha ni btaya uski metod se 
     // odd number =2x-1;  even number = 2x; hota ahi math mi;
               public static void Dimond_by_sardhakhapra(int n){
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1); j++){
                        System.out.print("*");
                        
                    } 
                    System.out.println();
                }
                //for second half
                 
                for(int i=n;i>=1; i--){
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1); j++){
                        System.out.print("*");
                       }
                        
                       System.out.println();
                     } 
               }
    public static void main(String[] args) {
        //diomondpattern(16);
        Dimond_by_sardhakhapra(10);
    }

}