public class bssqroot {
    static int sqrootbs(int n){
        int ans =-1;
        int st=0;
        int end=n;
        int mid;

        while(st<=end){
            mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==n){
                return mid;
            }
            else if(val>n){
                end=mid-1;
            }
            else{
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(sqrootbs(n));
    }
}
