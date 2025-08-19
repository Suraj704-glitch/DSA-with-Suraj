public class BintoDec {
    public static void bintodeci(int binNum){
        int decNum=0,power=0;
       while(binNum>0){
        
        int lastdigit=binNum%10;
        decNum=decNum +lastdigit*((int)Math.pow(2,power));
        power++ ;
        binNum=binNum/10;
        }

        System.out.println(decNum);


    }


    public static void main(String[] args) {
        bintodeci(1001);
    }
    
}
