import java.util.Arrays;

public class problem3 {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sortswap(int[] arr){
        int n=arr.length;
        if(n<=1){
            return;
        }
        int x=-1;
        int y=-1;
        for(int i=1;i<n;i++){
            if (arr[i-1]>arr[i]) {
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        swap(arr,x,y);
    }
    public static void main(String args[]){
        int[] arr={10};
        sortswap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
