package SerializableDeserializable;

import SerializableDeserializable.MyObject;

import java.io.*;

public class Sender implements Runnable{

    String path;
    public Sender(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        setobject();
    }

    private void setobject () {
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new MyObject("Master", 11));

        }catch (IOException e){
            System.out.println("Cannot SET file...");
        }
    }
}
