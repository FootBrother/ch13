public class ex05 {
    public static void main(String[] args) {
        int num = 5;
        int[] d = { 3, 0, 0, 1 };
        for (int i = 0; i < d.length; i++) {
            try {
                if (d[i] == 0) {
                    throw new ArithmeticException("除數為0不計算");
                }
                int result = num / d[i];
                System.out.println(num + "/" + d[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                // 無論是否捕捉到異常，finally 區塊中的程式碼都會執行。
            }
        }
    }
}
