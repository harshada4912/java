class first extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running .......");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(" Even Numbers :- " + i);
            }
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



public class evenodd1 {
    public static void main(String[] args) {
         
System.out.println(Thread.currentThread().getName() + " main Thread is running .......");

        first f = new first();
                f.start();
        try {
            f.join();
        } catch (Exception e) {
            System.out.println(e);
        }
               }

}