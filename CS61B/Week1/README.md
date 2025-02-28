### 1.1

The course is about algorithms and data structures

1. All code in Java must be part of a calss
2. We delimit the beginning and end of segments of code with curlly braces
3. All statements in Java must end in a semi-colon
4. For code to run we need `public static void main()`

1. Before Java variables can be used, they must be declared
2. Java variables must a specific type
3. Java variable types can never change
4. In Java, types are verified before the code runs. 

1. To declare a function in Java, use `public static`
2. All paremeters of a function must have a type, and the function itself must have a return type.
3. All functions must be part of a class, called 'method'

### 1.2

1. Classes can contain not just funcs but data

Instance variable `public int weightInPounds`

Constructor, determines how to instantiate the class

Non-static method, aka instance method `public void makeNoise()`

> Something else which might not important:
>
> For single .java we can use java directly run it's code if it's independent
>
> For a .java program which depends on other classes or files, have to use javac to compile first, then use java to run it, else it will response error messages

Diff between Static and Instance

1. Static methods are invoked uisng the calss name
2. Instance methods are invoked using an instance name
3. Static methods can not access my instance variables 