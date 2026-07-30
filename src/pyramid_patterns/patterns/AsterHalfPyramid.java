package pyramid_patterns.patterns;
//1
public class AsterHalfPyramid {
    public static void main(String[] args){
        int num = 5,row, col;
        for(row=0 ; row<num; row++){
            for(col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
            /*===============================
             *
             * *
             * * *
             * * * *
             * * * * *
             ================================*/
