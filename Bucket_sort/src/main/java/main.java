import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class main {
    static void bucksort(float[] arr){
        int n=arr.length;

        //buckets
        ArrayList<Float>[] buckets=new ArrayList[n];

        //create  empty buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();

        }

        //Add elements into our buckets
        for(int i=0;i<n;i++){
            int bucketindex=(int) arr[i]*n;
            buckets[bucketindex].add(arr[i]);
        }

        //sort each bucket  individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //Merge all buckets to get final sorted array
        int index=0;
        for(int i=0;i< buckets.length;i++){
            ArrayList<Float> currBucket=buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++]= currBucket.get(j);
            }
        }
    }
    public static void main(String[] args){
        float[] arr={0.4f,0.6f,0.2f,0.08f,0.01f};
        bucksort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
