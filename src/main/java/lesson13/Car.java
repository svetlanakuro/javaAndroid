package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier barrier;
    private CountDownLatch finishLatch;
    private final static AtomicBoolean hasViner = new AtomicBoolean();
    Lock lock = new ReentrantLock();
    private static int place = 1;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void setFinishLatch(CountDownLatch finishLatch) {
        this.finishLatch = finishLatch;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            if (barrier != null) {
                barrier.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        try {
            lock.lock();
            if (!hasViner.getAndSet(true)) {
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> участник " + this.name + " победитель! Он занимает " + place + " место.");
            } else {
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> участник " + this.name + " занимает " + place + " место.");
            }
            place++;
        } finally {
            lock.unlock();
        }

        finishLatch.countDown();
    }
}
