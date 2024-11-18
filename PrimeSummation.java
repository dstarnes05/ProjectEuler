public class PrimeSummation {
    public static void main(String[] args) {
        long total = 0;
        long curr = 0;
        for (long i = 2; total < 10001; i ++){
            if (isPrime(i)){
                total ++;
                curr = i;
            }
        }
        System.out.println(curr);
    }
    public static boolean isPrime(long n){
        boolean prime = true;
        for (long i = 2; i <= Math.sqrt(n); i ++){
            if (n % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}