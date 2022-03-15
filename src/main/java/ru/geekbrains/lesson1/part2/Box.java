package ru.geekbrains.lesson1.part2;

import java.util.ArrayList;

//Задача:
//        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        Для хранения фруктов внутри коробки можно использовать ArrayList;
//        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//        Не забываем про метод добавления фрукта в коробку.

public class Box <T extends Fruit> {
    private ArrayList <T> box;

    public Box () {
        this.box = new ArrayList<>();
    }


    public float getWeight () {
        float sumWeight = 0;
        for (int i = 0; i < box.size(); i++) {
            sumWeight += box.get(i).getWeight();
        }
        return sumWeight;
    }

    public boolean compare (Box <?> comparedBox) {
        return (this.getWeight() == comparedBox.getWeight());
    }

    public void fromBoxToBox (Box <T> newBox) {
        for (int i =0; i < this.box.size(); i++) {
            newBox.addFruit(this.box.get(i));
        }
        this.box.clear();
    }



    public void addFruit (T newFruit) {
        this.box.add(newFruit);
    }

}
