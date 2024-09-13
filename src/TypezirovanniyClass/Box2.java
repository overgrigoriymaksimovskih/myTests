package TypezirovanniyClass;

public class Box2<T extends Number> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        Box2<Integer> stringBox = new Box2<>();

//        stringBox.set("Старая строка"); не сможем вставить потому что объекты класса типизированы чем то что наследуется от Number
        stringBox.set(2);
        System.out.println(stringBox.get());

        System.out.println(stringBox.get());

//        stringBox.set(12345);//ошибка компиляции!
    }
}
