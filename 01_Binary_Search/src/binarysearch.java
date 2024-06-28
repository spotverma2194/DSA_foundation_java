public class binarysearch {
    static boolean binarysearch(int[] a,int target){
        int n=a.length;
        int st=0,ed=n-1;
        while(st <= ed){
            int mid= (st+ed)/2;
            if(target==a[mid]){
                return true;
            } else if (target < a[mid]) {
                ed=mid-1;
            } else {
                st=mid+1;
            }
        }
        return false;
    }
    static boolean recursivebinarysearch(int[] a,int st,int ed,int tg){
        if(st > ed) return false;
        int mid =(st+ed)/2;
        if(tg==a[mid]){
            return  true;
        } else if (tg<a[mid]) {
            return recursivebinarysearch(a,st,mid-1,tg);
        }else {
            return recursivebinarysearch(a,mid+1,ed,tg);
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int t=0;
        while (t != 10){
            System.out.printf("%d exist in arry %b",t,recursivebinarysearch(arr,0, arr.length-1,t ));
            System.out.println();
            t++;
        }
    }
}
