public class nsum {
    public static long nsum(long n){
        long ans=0;
        if(n==0) return ans;
        long smaller=nsum(n-1);
        ans=n+smaller;
        return ans;
    }
    
    public static int sumOfAllDivisors(int n){
        if(n==0) return 0;
        int smallans=sumOfAllDivisors(n-1);
        int ans=smallans+
    }
    public static void main(String[] args){
        long n=3;
        System.out.println(nsum(n));
    }
}
