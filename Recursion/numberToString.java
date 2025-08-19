public class numberToString {
    static String digites[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void numsToenglish(int n){
        if(n==0){
            return;
        }
        int lastdigits=n%10;
        numsToenglish(n/10);
        System.out.print(digites[lastdigits]+" ");

    }
    public static void main(String[] args) {
        numsToenglish(1947);
    }
}
