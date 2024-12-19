import java.util.*;
public class dtobnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int num=sc.nextInt();
        int mul=1;
        int ans=0;
        while(num>0){
            int rem=num%2;
            ans=ans+rem*mul;
            mul=mul*10;
            num=num/2;
        }
        System.out.println(ans);
    }
}
