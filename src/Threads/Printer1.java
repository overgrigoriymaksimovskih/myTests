package Threads;

public class Printer1 implements Runnable{
    String name;
    public Printer1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("I’m " + name);
        }
    }

    public static void main(String[] args) {
        //три нити на основе трех объектов
        Printer1 th1 = new Printer1("Master");
        Thread thread1 = new Thread(th1);
        thread1.start();

        Printer1 th2 = new Printer1("pro");
        Thread thread2 = new Thread(th2);
        thread2.start();

        Printer1 th3 = new Printer1("Food");
        Thread thread3 = new Thread(th3);
        thread3.start();

        //три нити на основе одного объекта
        Printer1 th4 = new Printer1("Kamakura");
        Thread thread4 = new Thread(th4);
        thread4.start();

        Thread thread5 = new Thread(th4);
        thread5.start();

        Thread thread6 = new Thread(th4);
        thread6.start();
    }
}
