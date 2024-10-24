package code_challenges;

public class Problem9 {
    public boolean isPalindrome(int x) {
        int numeroOriginal = x;
        int numeroInvertido = 0;

        while(x > 0){
            numeroInvertido = numeroInvertido * 10 + x % 10;
            x/=10;

        }
        System.out.println(numeroInvertido);
        return numeroOriginal == numeroInvertido;

    }

    public static void main(String[] args) {
        Problem9 palindrome = new Problem9();
        System.out.println(palindrome.isPalindrome(1232));

    }
}
