class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class DistanceException extends Exception {
    public DistanceException(String message) {
        super(message);
    }
}

class OutException extends DistanceException {
    public OutException(String message) {
        super(message);
    }
}

class InException extends DistanceException {
    public InException(String message) {
        super(message);
    }
}

class CenterException extends DistanceException {
    public CenterException(String message) {
        super(message);
    }
}

public class ex12 {
    public static void main(String[] args) {
        try {
            double x1 = 5.3;
            double y1 = 6.8;
            double x2 = 0.2;
            double y2 = 9.5;
            double radius = 10.0;

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            double distance = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));

            if (distance > radius) {
                throw new OutException("(" + x1 + "," + y1 + ")不在半徑" + radius + "," + "圓心(" + x2 + "," + y2 + ")的圓內");
            } else if (distance == radius) {
                throw new CenterException("(" + x1 + "," + y1 + ")在半徑" + radius + "," + "圓心(" + x2 + "," + y2 + ")的圓上");
            } else {
                throw new InException("(" + x1 + "," + y1 + ")在半徑" + radius + "," + "圓心(" + x2 + "," + y2 + ")的圓內");
            }
        } catch (DistanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
