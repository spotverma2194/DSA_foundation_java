import java.util.*;
public class largestnumber {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    String rstr="";
    for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        rstr=rstr+ch;
    }
    if(str==rstr){
        System.out.println("true");
    }
    System.out.println(rstr);

}
}
