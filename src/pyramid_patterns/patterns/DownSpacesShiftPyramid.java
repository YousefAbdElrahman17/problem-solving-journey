package pyramid_patterns.patterns;

public class DownSpacesShiftPyramid {
    public static void main(String[] args) {
        int row, col, space, num=5;

        for (row=num; row>0; row--) {
            for (space = num - row; space > 0; space--)
                System.out.print(" ");
            for (col=row; col>0 ; col--)
                    System.out.print("*");
            System.out.println();
        }
    }
}
           /*===============================
            *****
             ****
              ***
               **
                *
           ================================*/
