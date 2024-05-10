package com.totoCastaldi;

import java.util.function.Function;

public class App 
{
    public static void main( String[] args )
    {
        Function<String, String> up = (s) -> s.toUpperCase();
        System.out.println(up.apply("java8"));
    }
}
