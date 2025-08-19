public class friendpairing {
    public static int friendspairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }
        //choise
        //make single 
        int fnm1=friendspairing(n-1);
        //jb pairing mi hogaa
        int fnm2=friendspairing(n-2);
        //ppair mo (n-1)wayd se bna skti haii
        int pairway=(n-1)*fnm2;
        int totaway=fnm1+pairway;
        return totaway;
    }
    
    public static int friendpairing(int n ){
        //base case
        if(n==1||n==2){
            return n;
        }
        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }
    public static void main(String[] args) {
        System.out.print(friendpairing(3));
    }
}
