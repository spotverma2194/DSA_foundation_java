import java.util.*;
public class butterfly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number= ");
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int col=1;col<=(2*n-2*row);col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1;row<=n-1;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("*");
            }
            for(int col=1;col<=2*row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
