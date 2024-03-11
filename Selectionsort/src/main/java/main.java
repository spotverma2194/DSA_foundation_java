import java.util.Arrays;

public class main {
    static void selectionsort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=tmp;
        }

    }
    public static void main(String[] args){
        int[] a={7,5,4,1,3};
        selectionsort(a);
        System.out.println(Arrays.toString(a));
    }

}
