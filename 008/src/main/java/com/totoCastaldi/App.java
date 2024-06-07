package com.totoCastaldi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args )
    {
        Stream<Integer> fibonacci = Stream.generate(new Supplier<Integer>() {
            int a = 0;
            int b = 1;
            @Override
            public Integer get() {
                int res = a;
                int c = a + b;
                a = b;
                b = c;
                return res;
            }
        });

        fibonacci.limit(13).forEach(System.out::println);

    }

}
