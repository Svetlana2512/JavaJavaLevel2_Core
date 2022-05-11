package Lesson3;


public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();


        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);


        boxApple.compare(boxOrange);
    }
}
