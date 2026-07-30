package pyramid_patterns.patterns;
//2
public class NumbersHalfPyramid {
    public static void main(String[] args){
        int num = 5, row, col;
        for(row=1; row<=num; row++){
            for(col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.print("\n");
        }
    }
}
/*================================
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 ===============================
=========== in case but row instead of col in inside print. this will show:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
================================= */