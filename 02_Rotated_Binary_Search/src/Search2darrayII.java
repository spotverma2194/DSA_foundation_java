public class Search2darrayII {
    static boolean searching2dmatrix(int[][] mat,int target){
        int n=mat.length,m=mat[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(target==mat[i][j]) return true;
            else if(target<mat[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    static boolean searcharray(int[][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(target==arr[i][j]) return true;
            else if(target<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] mat={{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        System.out.println(searching2dmatrix(mat,13));
        System.out.println(searcharray(mat,0));
    }
}
