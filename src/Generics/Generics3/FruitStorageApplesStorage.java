package Generics.Generics3;

public class FruitStorageApplesStorage extends FruitStorage{
    Integer fruitCount;

    public FruitStorageApplesStorage(Integer fruitCount) {
        this.fruitCount = fruitCount;
    }

    @Override
    public Integer getFruitCount() {
        return this.fruitCount;
    }
}
