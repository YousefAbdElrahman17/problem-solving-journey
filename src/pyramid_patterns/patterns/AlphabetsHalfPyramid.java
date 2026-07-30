package pyramid_patterns.patterns;

public class AlphabetsHalfPyramid {
    public static void main(String[] args){
        int row, col;
        char[] alphabet;
        alphabet = new char[]{'a', 'b', 'c', 'd', 'e'};
        for(row=0; row<alphabet.length; row++){
            for(col=0; col<=row ;col++){
                System.out.print(alphabet[row]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("============================");

        // Another Solution .. Faster (no need to array)
        char last = 'E', alpha = 'A';
        for(row=0; row<=(last-'A') ; ++row){        // using last-1 will make it deal in ASCII so,
            for(col=0; col<=row ; ++col){           //using E-A is a 4 diff in ASCII, with <= gives us 5 iterations
                System.out.print(alpha+" ");
            }
            ++alpha;                    // note that using alpha+1 it will go to ASCII Like A=65 so A+1=66.
            System.out.print("\n");
        }
    }
}
            /*================================
            a
            b b
            c c c
            d d d d
            e e e e e
             ===============================
            =========== in case but col instead of row in inside print. this will show:
            a
            a b
            a b c
            a b c d
            a b c d e
            ================================= */
