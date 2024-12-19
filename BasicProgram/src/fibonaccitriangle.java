import java.util.*;
public class fibonaccitriangle {
    public  static void main( String argsp[]){
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++){
            int firstnum=0;
            int seconnum=1;
            System.out.print(seconnum+",");
            for(int j=1;j<i;j++){
                int nextnum=firstnum+seconnum;
                System.out.print(nextnum+",");
                firstnum=seconnum;
                seconnum=nextnum;
            }
            System.out.println();

        }

    }
}
