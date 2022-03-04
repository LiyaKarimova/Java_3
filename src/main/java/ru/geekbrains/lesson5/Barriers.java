package ru.geekbrains.lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Barriers {
    public static CyclicBarrier cyclicBarrier;
    public static CountDownLatch cdlStart;
    public static CountDownLatch cdlFinal;
    public static Lock lock = new ReentrantLock();

    public Barriers() {
        cyclicBarrier = new CyclicBarrier(MainClass.CARS_COUNT1);
        cdlStart = new CountDownLatch(MainClass.CARS_COUNT1);
        cdlFinal = new CountDownLatch(MainClass.CARS_COUNT1);
    }
}

