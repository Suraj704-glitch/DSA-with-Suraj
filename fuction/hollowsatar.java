public class hollowsatar {
    public  static void hollowstar(int rownum ,int coulumnum ){
        for(int i=1;i<=rownum;i++){
            for(int j=1;j<=coulumnum;j++){
                if(i==1||i==rownum||j==1||j==coulumnum){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowstar(4,5);
        }
//     public  static void hollowstar(int i ,int j, int n){
// //         for(int i=1;i<=rownum;i++){
// //             for(int j=1;j<=coulumnum;j++){
// //                 if(i ==1||i==rownum||j==1||j==coulumnum||i==j){
// //                     System.out.print("* ");
// //                 }
// //                 else{
// //                     System.out.print(" ");
// //                 }
// //             }System.out.println();
// //         }
// //     }
// //     public static void main(String[] args) {
// //         hollowstar(6,6);
// //     }
    
// // }

// for( i=1;i<n;i++){
//     for( j=1;j<n;j++){
//         //if(i==0||i==n-1||j==0||j==n-1){
//             System.out.print("*");
//        // }
//         // else{
//         //     System.out.print(" ");
//         // }
//     }
//     //System.out.println();
// }
//     public static void main(String[] args) {
//                 hollowstar(6,6,6);
//              }
