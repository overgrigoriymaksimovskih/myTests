package ru.chelinvest_01.utils;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.digitHandlers.impl.*;

import java.util.Arrays;

public final class HandlersDispatcher {
    private HandlersDispatcher() {
    }
    public static String handleNumber(Long nSum, String sGender, String sCase) {

        StringBuilder stringBuilder = new StringBuilder();

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        H h = new H();
        I i = new I();
        J j = new J();

        if(nSum > 0 && nSum < 5){
            return a.process(nSum, sGender, sCase);
        }
        if(nSum > 4 && nSum < 10){
            return b.process(nSum, sGender, sCase);
        }
        if(nSum > 9 && nSum < 20){
            return c.process(nSum, sGender, sCase);
        }
        if(nSum > 19 && nSum < 40){
            return d.process(nSum, sGender, sCase);
        }
        //--------------------------------
        if(nSum > 39 && nSum < 50){
            return e.process(nSum, sGender, sCase);
        }
        if(nSum > 89 && nSum < 100){
            return e.process(nSum, sGender, sCase);
        }


//        if(nSum == 40 || nSum == 90 || nSum == 100){
//            return e.process(nSum, sGender, sCase);
//        }
        if(nSum > 99 && nSum < 200){
            return e.process(nSum, sGender, sCase);
        }
        //------------------------------
        if(nSum > 49 && nSum < 90){
            return f.process(nSum, sGender, sCase);
        }

        if(nSum > 199 && nSum < 1000){
            return g.process(nSum, sGender, sCase);
        }
        if(nSum > 999 && nSum < 1000000){
            return h.process(nSum, sGender, sCase);
        }
        if(nSum > 999999 && nSum < 1000000000){
            return i.process(nSum, sGender, sCase);
        }
        if(nSum > 999999999 && nSum < 1000000000000L){
            return j.process(nSum, sGender, sCase);
        }

        return "empty - " + nSum;
    }
}
