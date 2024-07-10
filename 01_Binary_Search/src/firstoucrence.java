public class firstoucrence {
    static int firstoccbinary(int[] a,int x ){
        int n=a.length;
        int fo=-1;
        int st=0;
        int ed=n-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(x==a[mid]){
                fo=mid;
                ed=mid-1;
            } else if (x<a[mid]) {
                ed=mid-1;
            }else{
                st=mid+1;
            }
        }
        return fo ;
    }
    public static void main(String[] args){
        int[] arr={2,2,2,3,4,4,5,5,5,6,7,8,8,8};
        int x=3;
        System.out.println(firstoccbinary(arr,x));
    }
}
