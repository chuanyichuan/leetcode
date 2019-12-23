package cc.kevinlu.leetcode;

import java.util.concurrent.Semaphore;

public class MainTest1114 {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread t1 = new Thread(() -> System.out.println("first"));
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("second");
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("third");
            }
        };
        foo.first(t1);
        foo.second(t2);
        foo.third(t3);
    }

}

class Foo {

    private Semaphore semaphore1 = new Semaphore(1);
    private Semaphore semaphore2 = new Semaphore(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphore1.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        semaphore2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
