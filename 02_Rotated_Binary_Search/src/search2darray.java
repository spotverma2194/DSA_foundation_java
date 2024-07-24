public class search2darray {
    static boolean searchin2darray(int[][] arr,int target){
        //number of rows=n,number of columns=m
        int n=arr.length;
        int m=arr[0].length;
        int st=0;
        int ed=n*m-1;
        while(st<ed){
            int mid=st+(ed-st)/2;
            int midele=arr[mid/m][mid%m];
            if(target==midele){
                return true;
            }
            else if(target<midele){
                ed=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchin2darray(arr,23));
    }
}
