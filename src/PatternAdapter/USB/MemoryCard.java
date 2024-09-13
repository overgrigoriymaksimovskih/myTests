package PatternAdapter.USB;


// Это наш класс, реализующий карту памяти. В нем уже есть 2 нужных нам метода,
// но вот беда: интерфейс USB он не реализует.
// Карту нельзя вставить в USB-разъем.
public class MemoryCard {
    public void insert() {
        System.out.println("Карта памяти успешно вставлена!");
    }

    public void copyData() {
        System.out.println("Данные скопированы на компьютер!");
    }
}
