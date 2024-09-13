package Threads.CancelThread;

class Clock implements Runnable {
    // Класс Clock реализует интерфейс Runnable, что означает, что он может быть использован для создания потока

    public void run() {
        // Метод run() должен быть реализован в классе, реализующем интерфейс Runnable. Он содержит основной код потока.

        Thread current = Thread.currentThread();
        // Сохраняем ссылку на текущий поток, чтобы проверить его состояние и прервать его, если это необходимо

        while (!current.isInterrupted()) {
            // Цик выполнения потока. Поток продолжает выполнение, пока он не будет прерван.

            try {
                Thread.sleep(1000);
                // Метод sleep() приостанавливает выполнение потока на заданное количество миллисекунд (1000 миллисекунд = 1 секунда).
                // Если поток будет прерван, во время ожидания будет выброшено исключение InterruptedException.
            } catch (InterruptedException e) {
                // Обработка исключения InterruptedException. Поток будет прерван и необходимо обработать исключение.

                e.printStackTrace();
                // Печать стектрейса исключения для отладки.

                current.interrupt();
                // Восстановление состояния прерванного потока. Это позволяет потоку быть корректно завершенным.
            }

            System.out.println("Tik");
            // Вывод "Tik" на консоль каждую секунду.
        }
    }

    public static void main(String[] args) throws Exception {
        // Главный метод main() является точкой входа в программу.

        Clock clock = new Clock();
        // Создание экземпляра класса Clock.

        Thread clockThread = new Thread(clock);
        // Создание объекта Thread, который будет использовать экземпляр класса Clock в качестве Runnable.

        clockThread.start();
        // Запуск потока. Метод start() вызывает метод run() класса Runnable, который был передан в конструктор Thread.

        Thread.sleep(10000);
        // Метод sleep() приостанавливает выполнение текущего потока (главного потока) на заданное количество миллисекунд (10000 миллисекунд = 10 секунд).

        clockThread.interrupt();
        // Прерывание потока clockThread. Это вызовет InterruptedException в методе sleep() потока clockThread и завершит его выполнение.
    }
}