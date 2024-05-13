package com.totoCastaldi;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {

    private Integer a = 0;
    private Integer b = 1;
    private Integer firstTwoCounter = 0;

    @Override
    public Integer get() {
        if (firstTwoCounter == 0) {
            firstTwoCounter ++;
            return a;
        }
        if (firstTwoCounter == 1) {
            firstTwoCounter ++;
            return b;
        } else {
            Integer result = a + b;
            a = b;
            b = result;
            return result;
        }
    }
}
