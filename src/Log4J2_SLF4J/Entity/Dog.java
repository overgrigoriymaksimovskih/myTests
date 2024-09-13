package Log4J2_SLF4J.Entity;

import org.slf4j.*;

public class Dog {

    private static final Logger log = LoggerFactory.getLogger(Dog.class);
    private String name;

    public Dog(String name) {
        log.trace("dogs constructor started");
        this.name = name;
        log.trace("dogs constructor ended with NAME={}", name );
    }

    public void makeSound(){
        System.out.println("Bark");
    }
}
