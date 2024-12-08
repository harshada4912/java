class NaturalNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("NaturalNumbersThread: " + i);
        }
    }
}

class EvenNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenNumbersThread: " + i);
            }
        }
    }
}

class OddNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("OddNumbersThread: " + i);
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        NaturalNumbersThread naturalNumbersThread = new NaturalNumbersThread();
        EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
        OddNumbersThread oddNumbersThread = new OddNumbersThread();

        naturalNumbersThread.setPriority(Thread.NORM_PRIORITY); 
        evenNumbersThread.setPriority(Thread.MIN_PRIORITY);
        oddNumbersThread.setPriority(Thread.MAX_PRIORITY);             
        naturalNumbersThread.start();
        evenNumbersThread.start();
        oddNumbersThread.start();
    }
}