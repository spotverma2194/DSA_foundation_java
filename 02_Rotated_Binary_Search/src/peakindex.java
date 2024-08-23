public class peakindex {
    //peak index in a mountain array
    static int peakindeainmountainarray(int[] a){
        int n=a.length;
        int ans=-1;
        int st=0;
        int ed=n-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(a[mid]<a[mid+1]){
                st=mid+1;
                ans=mid+1;
            }else{
                ed=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,0};
        System.out.println(peakindeainmountainarray(arr));
    }
}
