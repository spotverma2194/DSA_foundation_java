import java.util.*;
public class gcdlcm {
    public static void gcdlcm(int a,int b){
        int oa=a;
        int ob=b;
        while(a % b != 0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int gcd=b;
        System.out.println("gcd = "+gcd);
        int lcm=(oa*ob)/gcd;
        System.out.println("lcm = "+lcm);
    }
    public static void binary(int n){
        ArrayList<Integer> arr=new ArrayList<Integer>();

        while(n>0){
            int a=n%2;
            arr.add(a);
            n=n/2;
        }
        int s=arr.size();

        for(int i=s-1;i>=0;i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        gcdlcm(n1,n2);
        binary(13);
    }
}
