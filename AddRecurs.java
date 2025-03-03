public class AddRecurs {
    public static int funSum(int n){
        if(n==0){
            return 0;
        }
        return n+funSum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(funSum(n));
    }
}
