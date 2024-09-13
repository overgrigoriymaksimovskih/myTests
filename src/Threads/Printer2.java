package Threads;

public class Printer2 extends Thread{
    private String name;

    public Printer2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("My name is " + name);
        }
    }

    public static void main(String[] args) {
        Printer2 p21 = new Printer2("Master");
        p21.start();

        Printer2 p22 = new Printer2("Food");
        p22.start();
    }
}
