import java.util.Arrays;
import java.util.Random;

public class main {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int partion(int[] arr,int st,int end){
        Random r=new Random();
        int rt=r.nextInt(end-st)+st;
        int pivotele=arr[rt];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivotele){
                count++;
            }
        }
        int pivotindx=st+count;
        swap(arr,st,pivotindx);
        int i=st;
        int j=end;
        while(i<pivotindx && j>pivotindx){
            while(arr[i]<=pivotele){
                i++;
            }
            while(arr[j]>pivotele){
                j--;
            }
            if(i<pivotindx && j>pivotindx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotindx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st>=end) return ;
        int pivotindx=partion(arr,st,end);
        quicksort(arr, st, pivotindx-1);
        quicksort(arr,pivotindx+1,end);
    }

    public static void main(String[] args) {
        int[] arr={552,95,337,413,899,784,962,432,275,586,810,685,267,814,13,190,67,201,164,657,462,313,310,36,848,375,751,751};
       // swap(arr,0,3);
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
