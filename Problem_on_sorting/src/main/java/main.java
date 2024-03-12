import java.util.Arrays;

public class main {
    static void movezeroes(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public  static void main(String[] args){
        int[] arr={0,5,0,3,42};
        movezeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
