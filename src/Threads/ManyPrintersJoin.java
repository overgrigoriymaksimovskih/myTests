package Threads;

public class ManyPrintersJoin implements Runnable{
    String name;
    int repeatCount;

    public ManyPrintersJoin(String name, int repeatCount) {
        this.name = name;
        this.repeatCount = repeatCount;
    }

    @Override
    public void run() {
        System.out.println("Started stream..." + name);
        if(this.name == "Vtoroy"){

        }
        for (int i = 0; i < repeatCount; i++) {

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("iteration " + name + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ManyPrintersJoin mpj1 = new ManyPrintersJoin("Perviy", 20);
        Thread th1 = new Thread(mpj1);
        th1.start();

        th1.join();

        ManyPrintersJoin mpj2 = new ManyPrintersJoin("Vtoroy", 10);
        Thread th2 = new Thread(mpj2);
        th2.start();

        th2.join();

        System.out.println("The End");
    }
}
