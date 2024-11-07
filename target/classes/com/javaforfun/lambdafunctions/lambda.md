# Lambda

## Why Lambdas?

1. To reduce the amount of byte code
2. To introduce functional paradigm into Java
3. To enable support for parallel programming
4. Easier to use APIs and libraries

## Why Functional Programming?

1. We use it because it is easier and concise to use functional programming in certain situations.

## Problems of OOP

Every thing is assosiated with an object. No functions is possible without any class.

## Lambda Expression

A lambda expression is a inline value that is assigned to a variable. In lambda expression we assing a method to a vaiable i.e. the variable then contains the method.

### Format of lamda expression

``` java
<FunctionalInterfaceType> variableName = (parameters) -> {block_of_code} 
```
NOTE: All the interfaces mentioned in below examples are [***Functional Interfaces***](lambda.md#functional-interface).

#### Examples:
1. Lambda expression without an arguement(parameter).
```java
    GreetingInterface greetingsFunction = () -> System.out.println();
```
2. Lambda expression with arguements(parameters).
```java
    DoubleInterface doubleNumberFunction = (int a) -> a*2;
    AddInterface addFunction = (int a, int b) -> a+b;
    // when passing the parameters to the lamda we can skip the type and the compiler will figure that out on its own using a concept called type inference
    DivisionInterface safeDivideFunction = (a, b) -> {
        if(b == 0 ) return 0;
        return a/b;
    };
    StringLengthInterface stringLengthCountFunction = (String s) -> s.length();
```

NOTE: The Example saveDevisionFunction is using a concept called ***type inference*** using this concept the compiler will get to know the type of the passed parameter using the method signature defiend in the functional interface.

we can also pass the lambda expression as the parameter directly to a function as shown in below code snippet

```java
//function which excepts lambda expression as input
greet(()-> System.out.println("hello"));

public void greet(_____){
    ________();
}
```

## Functional Interface

#### Annotation:
@FunctionalInterface: helps us identify that in this perticular interface not more than one abstract method is allowed.

#### Defination (Java 7):
An interface with only one abstract method.

#### Defination (Java 8+):
An interface with only one abstract methods. It might or might not have default methods.

NOTE: Definations are different because of the default keyword that was introduces to implement methods in interfaces (java 9+).


## Anonymus Inner Class

Inline implementation of an interface by creating an anonymus class

```java
    //Example of anonymus inner class of GreetingInterface.
    GreetingInterface greetings = new GreetingInterface() {
        public void greet() {
            System.out.println("hello!");
        } 
    };

    greetings.greet();
```

### Why Lambda is of Functional Interface Type?
The reason behind this decision is backward compatibility. The advantage of using functional interface type is for all the older libraries using the interface in the method signatures we can now send the instance of this functional interface without rewriting them.

