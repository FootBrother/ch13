import java.util.Scanner;

class IntegerLessThanZeroException extends Exception {
    IntegerLessThanZeroException(String message) {
        super(message);
    }
}

class IntegerGreaterThanZeroException extends Exception {
    IntegerGreaterThanZeroException(String message) {
        super(message);
    }
}

class IntegerEqualToZeroException extends Exception {
    IntegerEqualToZeroException(String message) {
        super(message);
    }
}

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數: ");
            int userInput = scanner.nextInt();
            checkInteger(userInput);
        } catch (IntegerLessThanZeroException e) {
            System.out.println("輸入的整數小於0");
        } catch (IntegerGreaterThanZeroException e) {
            System.out.println("輸入的整數大於0");
        } catch (IntegerEqualToZeroException e) {
            System.out.println("輸入的整數等於0");
        } catch (Exception e) {
            System.out.println("輸入錯誤，請輸入整數。");
        } finally {
            scanner.close();
        }
    }

    static void checkInteger(int number)
            throws IntegerLessThanZeroException, IntegerGreaterThanZeroException, IntegerEqualToZeroException {
        if (number < 0) {
            throw new IntegerLessThanZeroException("輸入的整數小於0");
        } else if (number > 0) {
            throw new IntegerGreaterThanZeroException("輸入的整數大於0");
        } else {
            throw new IntegerEqualToZeroException("輸入的整數等於0");
        }
    }
}
