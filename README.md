programming lang references
===========================

# Running examples

## Java 8

```bash
mvn clean install
    java -jar target/lang-ref-1.0-SNAPSHOT.jar
```

Tested With (mvn --version)

Apache Maven 3.9.6

Java version: 17.0.3, vendor: Eclipse Adoptium, runtime: ...

# Java 8 

TODO:
default keyword in Interfaces

## Lambdas

(000) JAVA8 : Write an implementation of the Comparator Interace using Lambda

## New Functional Interfaces

(001) JAVA8 : Print all elements of a List of Objects using Consumer Interface 

(002) JAVA8 : Write an implementation of java.util.functio.Function that returns the uppercase version of a String. Write it with Lambda

(003) JAVA8 : Write a Fibonacci series implementation using java.util.function.Supplier

(004) JAVA8 : Print an internal field of a Bean using Method Reference. There are a list of Bean so you can use a Consumer

(005) JAVA8 : Filter and collect a List of bean into a Map. Use StreamAPI

(006) JAVA8 : Starting from a List of Bean where each Bean has a property with type List<String> , print all the values of that property in the collection of bean. Use FlatMap

(007) JAVA8 : Find max of Integer using Stream's Reduce method. Consider an Empty List of Integer as well

(008) JAVA8 : Fibonacci sequence with a Infinite Stream Of Integer build by Stream.generate static method 