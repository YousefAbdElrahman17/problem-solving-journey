package pyramid_patterns.patterns;

public class AsterInvertedHalfPyramid {
    public static void main(String[] args){
        int row, col, num=5;
        for(row=num; row>0; --row){
            for(col=0; col<row; ++col){         //  or -> for(col=row; col>0; --col)
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
           /*===============================
            * * * * *
            * * * *
            * * *
            * *
            *
           ================================*/
