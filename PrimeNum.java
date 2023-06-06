/* Checking for a Prime Number (VILLARIZA | BSCOE 2-6 2022-2023)
Software Design (CMPE 30074) */

public class PrimeNum {
    public static void main(String[] args) {
        int num = 29, count = 0; // this is the number to test
        boolean isPrime = false;

        for (int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++; if (count == 2) {
                    isPrime = true;
                }
            }
        } if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}