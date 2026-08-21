package pyramid_patterns.patterns;

public class SpacesShiftPyramid {
    public static void main(String[] args){
        int row, col, space, num=5;
        for (row = 0; row < num; row++) {
            for (space = num - row; space > 0; space--)
                System.out.print(" ");
            for (col = 0; col <= row; col++)
                System.out.print("*");
            System.out.println();
        }
    }
}
           /*===============================
                *
               **
              ***
             ****
            *****
           ================================*/
