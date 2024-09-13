package Log4J2_SLF4J;

//Конфигурационный файл лежит в D:\projects\0000\MyTests\src\log4j2.xml          !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import Log4J2_SLF4J.Entity.Dog;
import org.slf4j.*;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");
        log.trace("something not important");

        log.info("This test info message from class Main");
        log.debug("This test debug message from class Main");
//        System.out.println("Hello world");

        Dog dog = new Dog("Master");
        dog.makeSound();
    }
}
