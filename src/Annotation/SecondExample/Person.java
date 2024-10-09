package Annotation.SecondExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**

 Определение аннотации {@code Person} для описания характеристик персонажа в игре.
 Аннотация {@code Person} применяется к классам (типом является класс) и доступна во время выполнения программы.
 Аннотация содержит следующие атрибуты:
 {@code name} (по умолчанию пустая строка): имя персонажа.
 {@code live}: количество жизней персонажа.
 {@code strength}: сила персонажа.
 {@code magic} (по умолчанию 0): уровень магии персонажа.
 {@code attack} (по умолчанию 0): уровень атаки персонажа.
 {@code defense}: уровень защиты персонажа.
 Аннотация может быть использована для описания характеристик персонажа в классе, например:
 {@code
 @Person(name = "John", live = 100, strength = 50, magic = 20, attack = 30, defense = 40)
 public class Player {
 // код класса Player

 }
 } */
@Target(value= ElementType.TYPE) // Указывает, что аннотация может быть применена только к классам (типом является класс)
@Retention(value= RetentionPolicy.RUNTIME) // Указывает, что аннотация будет доступна во время выполнения программы

public @interface
Person {
         String name() default "";
         int live(); int strength();
         int magic() default 0;
         int attack() default 0;
         int defense();
 }