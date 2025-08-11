public class Demo {

    // with multithreading
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();
        SumCalculator sumC = new SumCalculator();
        Thread thread2 = new Thread(sumC);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            
        }
        

        System.out.println("TIME TAKEN: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

class NumberCounter extends Thread {
    public void run(){
        int count = 1;
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
    
}

class SumCalculator implements Runnable{
    public void run(){
        int count = 1;
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
}