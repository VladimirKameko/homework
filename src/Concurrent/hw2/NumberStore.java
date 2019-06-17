package Concurrent.hw2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class NumberStore {
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();
    private Random rnd = new Random();
    private LinkedList<Integer> list;

    public NumberStore(LinkedList<Integer> list) {
        this.list = list;
    }

    public void produce() {
        while (true) {
            try {
                writeLock.lock();
                if (list.size() < 10) {
                    System.out.println("Добавляем случайное число");
                    list.add(rnd.nextInt(100));
                    System.out.println("Число добавленно");

                }
            } finally {
                writeLock.unlock();
            }
        }
    }

    public void consume() {
        while (true) {
            try {
                readLock.lock();
                try {
                    Thread.sleep(rnd.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() != 0) {

                    System.out.println("Число, считанное из хранилища " + list.removeFirst());
                } else {
                    System.err.println("Список пуст");
                }
            } finally {
                readLock.unlock();
            }
        }
    }

}
