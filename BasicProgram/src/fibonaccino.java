import java.util.*;
public class fibonaccino {
    public static void main(String args[]){
        int firstnum=0;
        int secondnum=1;
        int nextnum;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        for(int i=1;i<=n;i++){
            System.out.print(firstnum + ",");
            nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
        }
    }
}




