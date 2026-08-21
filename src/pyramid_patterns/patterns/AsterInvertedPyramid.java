package pyramid_patterns.patterns;

public class AsterInvertedPyramid {

    public static void main(String[] args){
        int col, row, space, num=9;
        for(row=1; row<=num; row+=2){
            for(space=1; space<=(row); space++) System.out.print(" ");
            for(col=num; col>=row; col-=1)     System.out.print("* ");
            System.out.println();
        }
    }
}
           /*===============================
                 space<=(row/2) .. "*"
                *********
                 *******
                  *****
                   ***
                    *
             ================================
                  space<=(row)  .. "* "
             * * * * * * * * *
               * * * * * * *
                 * * * * *
                   * * *
                     *
           ================================*/
