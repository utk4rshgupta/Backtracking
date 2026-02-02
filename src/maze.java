public class maze {
    public static void main(String[] args) {
        //System.out.println(countmaze(3,3));
        path("",3,3);
    }
    static int countmaze(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = countmaze(r-1,c);
        int right = countmaze(r,c-1);
        return left + right;
    }

    static void path(String p,int c , int r){
        if(c==1 && r==1){
            System.out.println(p);
        }
        if(r>1) path(p+'D',r-1,c);
        if(c>1) path(p+'R',r,c-1);
    }
}
