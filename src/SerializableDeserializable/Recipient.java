package SerializableDeserializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Recipient implements Runnable {
    MyObject myObject;
    String path;
    public Recipient(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        while (myObject == null){
            try {
                myObject = getobject();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(myObject.getAge());
        System.out.println(myObject.getName());
    }

    private MyObject getobject () {
        try(FileInputStream fi = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fi)) {
            return (MyObject) oos.readObject();

        }catch (IOException e){
            System.out.println("Cannot get file...");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        return null;
    }
}