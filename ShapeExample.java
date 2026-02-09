interface Shape {
    void area();
}

class Square implements Shape {
    public void area() {
        System.out.println("Area of Square: 24");
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Shape s = new Square();
        s.area();
    }
}

