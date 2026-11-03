import java.util.concurrent.Semaphore;

class Foo {
    // Semaphores to coordinate thread execution order
    private final Semaphore semFirst2 = new Semaphore(0);
    private final Semaphore semSecond3 = new Semaphore(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        // Release permit so second() can proceed
        semFirst2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // Wait until first() finishes and releases the permit
        semFirst2.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        // Release permit so third() can proceed
        semSecond3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // Wait until second() finishes and releases the permit
        semSecond3.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}