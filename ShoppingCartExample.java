class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

public class ShoppingCartExample {
    public static void main(String[] args) {
        Product p1 = new Product(100);
        Product p2 = new Product(800);

        int total = p1.price + p2.price;
        System.out.println("Total Bill: " + total);
    }
}
