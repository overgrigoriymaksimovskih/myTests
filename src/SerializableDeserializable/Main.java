package SerializableDeserializable;

import Threads.Printer1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Recipient recipient = new Recipient("D:\\projects\\0000\\MyTests\\src\\SerializableDeserializable\\Storage\\out.dat");
        Sender sender = new Sender("D:\\projects\\0000\\MyTests\\src\\SerializableDeserializable\\Storage\\out.dat");

        Thread th1 = new Thread(recipient);
        th1.start();

        Thread.sleep(4000);

        Thread th2 = new Thread(sender);
        th2.start();
    }
}
