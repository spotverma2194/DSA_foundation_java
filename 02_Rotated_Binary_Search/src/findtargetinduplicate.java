public class findtargetinduplicate {
    //duplicates in rotated sorted array
    static boolean targetduplicate(int[] a,int t){
        int st=0;
        int ed=a.length-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(t==a[mid]){
                return true;
            }
            else if(a[st]==a[mid] && a[ed]==a[mid]){
                st++;
                ed--;
            }
            else if(a[mid] <= a[ed]){
                if(t>a[mid] && t<= a[ed]){
                    st=mid+1;
                }
                else{
                    ed=mid-1;
                }
            }
            else{
                if(t>=a[st] && t<a[mid]){
                    ed=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] a={0,0,0,1,1,1,2,0,0,0};
        System.out.println(targetduplicate(a,3));
    }
}
