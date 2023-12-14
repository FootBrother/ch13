public class ex07 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 87, 21, 6, 18};
        int[] den = {2, 0, 7, 0, 61, 0};

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            try {
                // 檢查除數是否為 0
                if (den[i] == 0) {
                    throw new ArithmeticException("除數為0");
                }

                // 檢查陣列索引是否超出範圍
                if (i >= arr.length || i >= den.length) {
                    throw new ArrayIndexOutOfBoundsException("陣列索引超出範圍");
                }

                // 進行除法運算
                sum += (double)arr[i] / den[i];
                System.out.println("sum = " + sum);
            } catch (Exception e) {
                // 捕捉所有可能的例外
                System.out.println("捕抓到例外: " + e.getMessage());
            }
        }
    }
}
