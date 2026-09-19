package beginner.solutions;

public class PalindromeNumber {

    public static void main(String[] args){

    System.out.print(isPalindrome(1222221));
    }
    public static boolean isPalindrome(int x) {

        if(x<0 || (x%10==0 && x!=0))
            return false;
        int reverse=0;
        while(x>reverse){
            reverse = (reverse*10) + (x%10);
            x/=10;
        }
        return x==reverse || x==reverse/10;
    }
}


