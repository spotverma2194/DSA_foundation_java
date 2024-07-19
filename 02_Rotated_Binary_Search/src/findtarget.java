public class findtarget {
    static int findtrg(int[] a,int t){
        int st=0;
        int ed=a.length-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(t==a[mid]){
                return mid;
            }
            else if (a[mid]<a[ed]){
                if(t>a[mid] && t<=a[ed]){
                    st=mid+1;
                }
                else{
                    ed=mid-1;
                }
            }
            else{
                if(t>=a[st] && t<a[mid]){
                    ed=mid-1;
                }
                else st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={9,10,11,12,1,2,3,4,5,6,7,8};
        System.out.println(findtrg(a,12));

    }
}
