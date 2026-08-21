package pyramid_patterns.patterns;

public class AsterPyramid {
    public static void main(String[] args){
        int col, row, space, num=9;
        for(row=1; row<=num; row+=2){
            for(space=(num-row); space>=0; space--) System.out.print(" ");
            for(col=1; col<=row; col+=1)     System.out.print("* ");
            System.out.println();
        }
    }
}
           /*===============================
                 (num-row)/2 .. "*"
                 *
                ***
               *****
              *******
             *********
             ================================
                     num-row  .. "* "
                     *
                   * * *
                 * * * * *
               * * * * * * *
             * * * * * * * * *
           ================================*/
