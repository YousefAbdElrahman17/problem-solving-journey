package pyramid_patterns.patterns;

public class NumbersInvertedHalfPyramid {
    public static void main(String[] args){
        int num=5, row, col;
        for(row=num; row>0; --row){
            for(col=1; col<=row; ++col){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
           /*===============================
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
           ================================*/
