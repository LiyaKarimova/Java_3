package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.part2.Fruit;
import ru.geekbrains.lesson1.part2.Orange;

import java.util.ArrayList;
//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//2. Написать метод, который преобразует массив в ArrayList;

//класс, который создает массив любого типа
public class EveryArrayClass <T> {
    private T [] arr;

    public EveryArrayClass(T ... arr) {
        this.arr = arr;
    }

    // метод, который меняет два эллемента в массиве
     private T[] changePlace (int i, int j) {
         T another = arr[i];
         arr [i] = arr [j];
         arr[j] = another;
        return arr;
    }

    // метод, печатающий массив
    private void printArr () {
        for (int j =0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    // метод, который превращает массив в ArrayList
    private ArrayList <T> toArrayList () {
        ArrayList <T> arrToList = new ArrayList<>();
        for (int i =0; i < arr.length;i++) {
            arrToList.add(arr [i]);
        }
        return  arrToList;
    }

    public static void main(String[] args) {
        EveryArrayClass <String> arrString = new EveryArrayClass<>("1","2","3","4","5");
        arrString.printArr();
        arrString.changePlace(1,3);
        System.out.println("new array: ");
        arrString.printArr();

        EveryArrayClass <Integer> arrInt = new EveryArrayClass<>(0,1,2,3,4,5);
        arrInt.changePlace(4,5);
        System.out.println("new array: ");
        arrInt.printArr();

        System.out.println(arrString.toArrayList());



    }
}





