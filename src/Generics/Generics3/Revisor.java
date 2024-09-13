package Generics.Generics3;

public class Revisor {
    public <T extends FruitStorage> int makeRevision(T... storages) {
        int summ = 0;
        for (T o : storages){
            summ = summ + o.getFruitCount();
        }
        return summ;
    }

}
