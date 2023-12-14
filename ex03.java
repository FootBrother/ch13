public class ex03 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            if (den == 0) {
                throw new ArithmeticException("除數為0");
            } else {
                int ans = num / den;
                System.out.println(ans);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            
            System.out.println("Finally 區塊執行");
        }
    }
}
