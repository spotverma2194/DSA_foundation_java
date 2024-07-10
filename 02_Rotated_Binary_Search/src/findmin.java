public class findmin {
    static int minidx(int[] a){
        int n=a.length;
        int st=0;
        int ed=n-1;
        int ans=0;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(a[mid]>a[n-1]){
                st=mid+1;
            }
            else if(a[mid]<=a[n-1]){
                ans=mid;
                ed=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,10,1,2,3,4};
        System.out.println(minidx(arr));

    }
}
