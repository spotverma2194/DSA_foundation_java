import java.util.*;
public class stringbasics {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //String str="Deepak Verma";
        //System.out.println(str);
        //String s=sc.nextLine();
        //System.out.println(s);
//        String s1="Hello World";
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(8));
//        String str="Hello";
//        System.out.println(str.indexOf('l'));
//        String str="Vniketh";
//        String gtr="Pniketh";
//        System.out.println(str.compareTo(gtr));
        String str="Heartbeat Vibes";
        String gt="Awesome";
//        System.out.println(str.contains("bes"));
        System.out.println(str.startsWith("Hear"));
        System.out.println(str.endsWith("bes"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gt));


    }
}
