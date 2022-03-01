package ru.geekbrains.lesson1.part2;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Orange orange1 = new Orange();
        Apple apple1 = new Apple();

        Box <Apple> appleBox = new Box<> ();
        appleBox.addFruit(apple);
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple);
        System.out.println("вес яблок: " + appleBox.getWeight());
        Box <Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange1);

        //orangeBox.addFruit((Orange) orange);
        System.out.println("вес апельсинов: " + orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box <Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(apple);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        appleBox.fromBoxToBox(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());




    }
}
