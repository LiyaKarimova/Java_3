package ru.geekbrains.lesson4;
//1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз
// (порядок – ABСABСABС). Используйте wait/notify/notifyAll.

public class PrintABCClass {

    private final Object mon = new Object();
    private volatile char currentLetter = 'A';


    public void printA () {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (currentLetter != 'A') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                currentLetter = 'B';
                mon.notifyAll();
            }
        }

    }

    public void printB () {
        synchronized (mon) {
            for (int i =0; i < 5; i++) {
                while (currentLetter != 'B') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                currentLetter = 'C';
                mon.notifyAll();
            }

        }

    }

    public void printC () {
        synchronized (mon) {
            for (int i =0; i < 5; i++) {
                while (currentLetter != 'C') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                currentLetter = 'A';
                mon.notifyAll();
            }

        }
    }

    public static void main(String[] args) {
        PrintABCClass print = new PrintABCClass();
        Thread thread1 = new Thread(() -> {
            print.printA();
        });
        Thread thread2 = new Thread(() -> {
            print.printB();
        });
        Thread thread3 = new Thread(() -> {
            print.printC();
        });

    thread1.start();
    thread2.start();
    thread3.start();
    }
}
