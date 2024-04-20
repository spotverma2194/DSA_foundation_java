import java.util.Arrays;

public class basicsort {
    static int findmax(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    static void basiccountsort(int[] arr){
        //find the largest element of the array
        int max=findmax(arr);
        
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i< count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void countsort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //make prefix sum array of count array
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        //find the index of each element in the original array and put it in output array
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        //put all ouptut elements in Original array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args){
        int[] arr={1,4,5,2,2,5};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
