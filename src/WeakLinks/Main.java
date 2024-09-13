package WeakLinks;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, демонстрирующий работу со слабыми ссылками в Java.
 */
public class Main {
    // Статический экземпляр класса Helper для вспомогательных методов.
    public static Helper helper = new Helper();

    /**
     * Внутренний класс, представляющий обезьяну.
     */
    public static class Monkey {
        // Имя обезьяны.
        private String name;

        /**
         * Конструктор обезьяны.
         * @param name Имя обезьяны.
         */
        public Monkey(String name) {
            this.name = name;
        }

        /**
         * Метод, вызываемый перед удалением объекта из памяти.
         */
        @Override
        protected void finalize() {
            // Установка флага, указывающего на то, что объект был удален.
            Helper.isFinalized = true;
            // Вывод сообщения о удалении обезьяны.
            System.out.format("Bye-Bye, %s!\n", name);
        }
    }

    /**
     * Основной метод программы.
     * @param args Аргументы командной строки.
     * @throws InterruptedException Исключение, возникающее при прерывании потока.
     */
    public static void main(String args[]) throws InterruptedException {
        // Запуск таймера.
        helper.startTime();

        // Создание обезьяны.
        Monkey monkey = new Monkey("Simka");

        // Создание слабой ссылки на обезьяну.
        WeakReference<Monkey> reference = new WeakReference<>(monkey);

        // Вызов сборщика мусора.
        helper.callGC();

        // Удаление сильной ссылки на обезьяну.
        monkey = null;

        // Вызов сборщика мусора.
        helper.callGC();

        // Употребление памяти для вызова сборщика мусора.
        helper.consumeHeap();

        // Проверка удаления обезьяны.
        if (reference.get() == null)
            System.out.println("Finalized");

        // Завершение программы.
        helper.finish();
    }

    /**
     * Вспомогательный класс для вспомогательных методов.
     */
    public static class Helper {
        // Флаг, указывающий на удаление объекта.
        public static boolean isFinalized;

        // Время запуска программы.
        private long startTime;

        /**
         * Запуск таймера.
         */
        void startTime() {
            this.startTime = System.currentTimeMillis();
        }

        /**
         * Получение времени, прошедшего с запуска программы.
         * @return Время в секундах.
         */
        int getTime() {
            return (int) (System.currentTimeMillis() - startTime) / 1000;
        }

        /**
         * Вызов сборщика мусора.
         * @throws InterruptedException Исключение, возникающее при прерывании потока.
         */
        void callGC() throws InterruptedException {
            System.gc();
            Thread.sleep(1000);
        }

        /**
         * Употребление памяти для вызова сборщика мусора.
         */
        void consumeHeap() {
            try {
                // Создание списка для потребления памяти.
                List<Main> heap = new ArrayList<Main>(100000);
                // Добавление элементов в список до удаления объекта.
                while (!isFinalized) {
                    heap.add(new Main());
                }
            } catch (OutOfMemoryError e) {
                // Вывод сообщения об ошибке нехватки памяти.
                System.out.println("An out-of-memory exception has occurred");
            }
        }

        /**
         * Завершение программы.
         */
        public void finish() {
            // Вывод сообщения о завершении программы.
            System.out.println("Done");
            // Вывод времени, прошедшего с запуска программы.
            System.out.println("It took " + getTime() + " s");
        }
    }
}