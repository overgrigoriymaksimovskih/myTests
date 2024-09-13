package TypezirovanniyClass;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();

        stringBox.set("Старая строка");
        System.out.println(stringBox.get());
        stringBox.set("Новая строка");

        System.out.println(stringBox.get());

//        stringBox.set(12345);//ошибка компиляции! потому что уже типизировали строкой если бы изначально типизировали Number - то можно бы было
    }
}
