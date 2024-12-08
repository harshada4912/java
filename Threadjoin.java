class NaturalNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("NaturalNumbersThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenNumbersThread: " + i);
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class OddNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("OddNumbersThread: " + i);
                try {
                    Thread.sleep(3000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Threadjoin {
    public static void main(String[] args) {
        NaturalNumbersThread n1 = new NaturalNumbersThread();
        EvenNumbersThread e1 = new EvenNumbersThread();
        OddNumbersThread o1 = new OddNumbersThread();

        n1.setPriority(Thread.NORM_PRIORITY); 
        e1.setPriority(Thread.MIN_PRIORITY);     
        o1.setPriority(Thread.MAX_PRIORITY);      

        n1.start();
        e1.start();
        o1.start();

        try {
            n1.join();
            e1.join();
            o1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All threads have finished execution.");
    }
}