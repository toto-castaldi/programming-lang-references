package com.totoCastaldi;

import java.util.Comparator;

public class App 
{
    public static void main( String[] args )
    {
        Comparator<Integer> c = (a, b) -> a.compareTo(b);
        System.out.println("" + c.compare(2, 1));
    }
}
