class Test {
    static void test(int num, int den) {
        if (den == 0) {
            throw new ArithmeticException("除數為0");
        }
        System.out.println(num + " / " + den + " = " + num / den);
    }
}

public class ex10 {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 87, 21, 6, 18 };
        int[] den = { 2, 0, 7, 0, 61, 0 };

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            try {

                if (i >= arr.length || i >= den.length) {
                    throw new ArrayIndexOutOfBoundsException("陣列索引超出範圍");
                }

                Test.test(arr[i], den[i]);
                sum += (double) arr[i] / den[i];
                System.out.println("sum = " + sum);
            } catch (ArithmeticException e) {

                System.out.println("捕抓到 ArithmeticException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("捕抓到 ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }
    }
}
