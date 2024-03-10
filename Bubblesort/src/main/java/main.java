import java.util.Arrays;

public class main {

    static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int tmp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=tmp;
                }
            }
        }
    }
    public  static void  main(String[] aargs){
        int[] num={5,7,4,3,1};
        bubblesort(num);
        System.out.println(Arrays.toString(num));
    }
}
