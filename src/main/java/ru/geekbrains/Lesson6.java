package ru.geekbrains;
//2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
// Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
// идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
// необходимо выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
// Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

// 3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
// то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {
        Lesson6 lesson6 = new Lesson6();

        int [] arr = {1,2,3,6,0,4,15,0,5,8,6};
        System.out.println(lesson6.isInArray4Or1(arr));
//        System.out.println(Arrays.toString(arr));
//        try {
//            System.out.println(Arrays.toString(lesson6.arrayAfter4(arr)));
//        } catch (RuntimeException exception) {
//            System.err.println("RuntimeException");
//
//        }

    }

    public int[]  arrayAfter4 (int ... arr1) throws RuntimeException {
        int [] arr2 = null;
            for (int i = arr1.length - 1 ; i > 0; i--) {
                if (arr1 [i] == 4) {
                    int j = i + 1;
                    arr2 = new int [arr1.length - j];
                    System.arraycopy(arr1,j,arr2,0,arr1.length - j);
                    break;
                }
            }
            if (arr2== null) {
                throw new RuntimeException("RuntimeException");
            }
        return arr2;
    }

    public boolean isInArray4Or1 (int ... arr) {
        boolean isInArray4 = false;
        boolean isInArray1 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                isInArray4 = true;
            }
            if (arr[i] == 1) {
                isInArray1 = true;
            }
        }
        return (isInArray1 & isInArray4);
    }

}
