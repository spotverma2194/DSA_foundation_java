public class Distributedchocolates {
    static  boolean isDivisionPossible(int[] a,int m,int maxchocoallowed){
        boolean n=true;
        return true;
    }
    static int distributedchocolates(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={5,3,1,4,2};
        int m=3;
        System.out.println();
    }
}

