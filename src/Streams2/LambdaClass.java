package Streams2;

import java.util.function.Predicate;

public class LambdaClass {
    public static void main(String[] args) {
        MyOperation<Integer> myOperation1 = (v1, v2) -> v1 + v2;
        MyOperation<String> myOperation2 = (v1, v2) -> v1 + v2;
        Predicate<String> myOperation3 = v3 -> v3.equals("r");
        
        System.out.println(myOperation1.getresult(2,2));
        System.out.println(myOperation2.getresult("2","2"));
    }
}
