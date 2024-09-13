package Generics.Generics3;

public class Main {
    public static void main(String[] args) {
        Revisor revisor = new Revisor();
        int resultOfRevision = revisor.makeRevision(new FruitStorageApplesStorage(22), new FruitStorageOrangesStorage(1000), new FruitStorageOrangesStorage(89));
        System.out.println(resultOfRevision);
    }
}
