
import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, count = 0;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a Prime Number");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }

        sc.close();
    }
}
