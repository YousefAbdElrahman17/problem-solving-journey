package pyramid_patterns.patterns;

public class AsterTriangle {
    public static void main(String[] args){
        int col, row, space, num=9;
        for (row = 0; row < num; row++) {
            for (space = num - row; space > 0; space--)
                System.out.print(" ");
            for (col = 0; col <= row; col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
           /*===============================
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                * * * * * *
               * * * * * * *
              * * * * * * * *
             * * * * * * * * *
           ================================*/
