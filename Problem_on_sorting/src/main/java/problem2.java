import java.util.Arrays;

public class problem2 {
    static void sortlexico(String[] str){
        int n=str.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(str[minidx].compareTo(str[j])>0){
                    minidx=j;
                }
            }
            String tmp=str[i];
            str[i]=str[minidx];
            str[minidx]=tmp;
        }
    }
    public static void main(String[] args){
        String[] s={"papaya","lime","watermelon","apple","mango","kiwi"};
        sortlexico(s);
        System.out.println(Arrays.toString(s));
    }
}
