package com.totoCastaldi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        Optional<Integer> res0 = app.maxOf(Arrays.asList(10,4,3,100,-20, 30, 8, 9));
        if (res0.isPresent()) {
            System.out.println(res0.get());
        } else {
            System.out.println("no max in list");
        }

        Optional<Integer> res1 = app.maxOf(Arrays.asList());
        if (res1.isPresent()) {
            System.out.println(res1.get());
        } else {
            System.out.println("no max in list");
        }

    }

    private Optional<Integer> maxOf(List<Integer> integers) {
        return integers.stream().reduce((x,y) -> x > y ? x : y);
    }
}
