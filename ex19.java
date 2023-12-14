import java.io.IOException;
import java.util.Scanner;

class ArgumentOutOfBoundException extends Exception {
    ArgumentOutOfBoundException(String message) {
        super(message);
    }
}

public class ex19 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數 n: ");
            int n = scanner.nextInt();

            if (n <= 1) {
                throw new ArgumentOutOfBoundException("輸入的數字必須大於1");
            }

            boolean isPrime = prime(n);

            if (isPrime) {
                System.out.println(n + " 是質數");
            } else {
                System.out.println(n + " 不是質數");
            }

        } catch (ArgumentOutOfBoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入錯誤，請輸入一個整數。");
        } finally {
            scanner.close();
        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
