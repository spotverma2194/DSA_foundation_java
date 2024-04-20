import java.util.*;
public class main {
    static int findmax(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countsort(int[] arr,int place){
        int n=arr.length;
        int[] ans=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        //prefix count array
        for(int i=1;i< count.length;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            ans[idx]= arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    static void radioxsort(int[] arr){
        int max=findmax(arr);
        for(int place=1;max/place>0;place *= 10){
            countsort(arr,place);
        }
    }
    public static void main(String[] args){
        int[] a={170,45,75,90,802,2};
        radioxsort(a);
        System.out.println(Arrays.toString(a));
    }
}
