package PatternAdapter.USB;

public class Main {
    public static void main(String[] args) {
        CardReader cr = new CardReader(new MemoryCard());
        cr.connectWithUsbCable();
    }
}
