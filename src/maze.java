public class maze {
    public static void main(String[] args) {
        System.out.println(countmaze(3,3));
    }
    static int countmaze(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = countmaze(r-1,c);
        int right = countmaze(r,c-1);
        return left + right;
    }
}
