class NotTriangleException extends Exception {
    NotTriangleException(String message) {
        super(message);
    }
}

class EquilateralTriangleException extends Exception {
    EquilateralTriangleException(String message) {
        super(message);
    }
}

class NotEquilateralTriangleException extends Exception {
    NotEquilateralTriangleException(String message) {
        super(message);
    }
}

public class ex14 {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 4;

        try {
            triangle(a, b, c);
        } catch (NotTriangleException e) {
            System.out.println("不構成三角形");
        } catch (EquilateralTriangleException e) {
            System.out.println("這是正三角形");
        } catch (NotEquilateralTriangleException e) {
            System.out.println("這不是正三角形");
        }
    }

    static void triangle(int a, int b, int c)
            throws NotTriangleException, EquilateralTriangleException, NotEquilateralTriangleException {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new NotTriangleException("不構成三角形");
        } else if (a == b && a == c && b == c) {
            throw new EquilateralTriangleException("這是正三角形");
        } else {
            throw new NotEquilateralTriangleException("這不是正三角形");
        }
    }
}
