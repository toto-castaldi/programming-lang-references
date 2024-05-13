package com.totoCastaldi;

public class App 
{
    public static void main( String[] args )
    {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 100; i++) {
            System.out.println(f.get());
        }
    }
}
