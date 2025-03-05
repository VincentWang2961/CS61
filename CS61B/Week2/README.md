### 2.1

Java use address to point out a object, so if simply using a variable euqals an object, the variable's object will change when original object changes

Each Java type has a diff way to interpret the bits, if declareing a variblae of a certian type in Java, the computer sets exactly enough bits to hold a thing of that type

Java fist allocates a box of bits for each instance variable of the class and fills then with a default value(e.g. 0, null)

Passing parematers obeys the same rule: simply copy the bits to the new scope

Arrays are also objects `int[] x = new int[]{0, 1, 2, 3, 4, 5};`

```java
public class IntList {
  public int first;
  public IntList rest;        

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }
  
  IntList L = new IntList(5, null);
	L.rest = new IntList(10, null);
	L.rest.rest = new IntList(15, null);
}
```



### 2.2

