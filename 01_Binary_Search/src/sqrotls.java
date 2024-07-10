public class sqrotls {
    static int saqureroot(int x){
        int y=1;
        while(y*y<=x){
            y++;
        }
        return y-1;
    }
    public static void main(String[] args) {
        int x=25;
        System.out.println(saqureroot(x));
    }
}
