import java.util.Arrays;

public class main {
   static void insertionsort(int[] a){
       int n=a.length;
       for(int i=1;i<n;i++){
           int j=i;
           //Insert a[i] into sorted left  part 0 to i
           while(j>0 && a[j]<a[j-1]){
               //swap a[j] ans a[j-1]
               int tmp=a[j];
               a[j]=a[j-1];
               a[j-1]=tmp;
               //decrement j by 1
               j--;

           }
       }
   }
    public static void main(String[] args){
       int[] a={9,4,2,1,6,3};
       insertionsort(a);
        System.out.println(Arrays.toString(a));
    }
}
