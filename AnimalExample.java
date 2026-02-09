class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.sound();
    }
}
