package ru.geekbrains.lesson5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Barriers {
    public CyclicBarrier cyclicBarrier;
    public CountDownLatch cdlStart;
    public CountDownLatch cdlFinal;
    public static Lock lock = new ReentrantLock();

    private static Barriers instance;

    private Barriers() {
        cyclicBarrier = new CyclicBarrier(MainClass.CARS_COUNT1);
        cdlStart = new CountDownLatch(MainClass.CARS_COUNT1);
        cdlFinal = new CountDownLatch(MainClass.CARS_COUNT1);
    }

    public static Barriers getInstance() {
        if(instance == null){
            instance = new Barriers();
        }
        return instance;
    }

    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }

    public CountDownLatch getCdlStart() {
        return cdlStart;
    }

    public CountDownLatch getCdlFinal() {
        return cdlFinal;
    }
}

