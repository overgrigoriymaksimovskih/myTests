package Generics.Generics3;

public class FruitStorageOrangesStorage extends FruitStorage{
    Integer fruitCount;

    public FruitStorageOrangesStorage(Integer fruitCount) {
        this.fruitCount = fruitCount;
    }

    @Override
    public Integer getFruitCount() {
        return this.fruitCount;
    }
}
