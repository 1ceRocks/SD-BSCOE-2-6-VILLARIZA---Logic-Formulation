/* Java code that will output the pattern below (VILLARIZA | BSCOE 2-6 2022-2023)
Software Design (CMPE 30074) */

public class IsoscelesPattern {
    public static void main(String[] args) {
        int num = 5;

        for(int i=1; i<=num; i++) {
            for(int j=0; j<num - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}