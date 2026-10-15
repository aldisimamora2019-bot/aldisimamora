class Animal {
}
class Dog extends Animal {
}
class Cat extends Animal {
}
public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Menggunakan Dog object
        obj = new Cat(); // Menggunakan Cat object
    }
}
