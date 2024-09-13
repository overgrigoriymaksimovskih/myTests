package Generics.Generics2;

public class Robot<T1 extends BodyStandart, T2 extends Head>{
    private T1 body;
    private T2 head;

    public Robot(T1 body, T2 head) {
        this.body = body;
        this.head = head;
    }

    public T1 getBody() {
        return body;
    }

    public T2 getHead() {
        return head;
    }
}
