public class peakindex2 {
    //leetcode 162 find peak element
    static int peakindex(int[] a){
        int n=a.length;
        int st=0;
        int ed=n-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if((mid==0 || a[mid]>a[mid-1])&&(mid==n-1 || a[mid]>a[mid+1])){
                return mid;
            }
            if(a[mid]<a[mid+1]){
                st=mid+1;
            }else{
                ed=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(peakindex(arr));
    }
}
