import java.util.*;
public class btodnumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number= ");
        int num=sc.nextInt();
        int mul=1;
        int ans=0;
        while(num>0){
            int digit=num%10;
            ans=ans+digit*mul;
            mul=mul*2;
            num=num/10;
        }
        System.out.println(ans);
    }


}
