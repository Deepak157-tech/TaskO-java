class Rectangle {

    private int length;
    private int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.calculateArea();
    }
}
