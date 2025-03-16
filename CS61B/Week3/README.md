### 2.3

About `SLList.addLast()`, if we are going to add a new node at the end of the list, we need to iterate all the list which is slow. To solve the problem, we could add a last node cache, however it is also slow when we remove the last node

To solve the problem that removing the last node is slow, we could add a prev pointer

We also need two sentinels one of them is on the head, and one of them is on the rear

To use a single sentinel, we could use circular sentinel:

![dllist_circular_sentinel_size_2.png](https://joshhug.gitbooks.io/hug61b/content/chap2/fig23/dllist_circular_sentinel_size_2.png)

Parameter: `SLList<String>`

Generics

### 2.4

Arrays consist of 

​	A fixed integer length which can not be changed

​	A sequence of N memory boxes where N=length

```java
y = new int[3];
x = new int[]{1, 2, 3, 4, 5};
int[] w = {6, 7, 8, 9};
```

`System.arraycopy(b, 0, x, 3, 2);`

In python: `x[3:5] = b[0:2]`

Parameters: (Source array, Start position in sources, Target array, Start position in target, Number to copy)

2D Arrays: array boxes can contain references to arrays

Array indicaes can be computed at runtime

Class member variable names cannot be computed and used at runtime, the conlt(ez) way to access a member of a clas is with hard-code dot notation

![Screenshot 2025-03-12 at 9.45.29 am](/Users/vincent/Library/Application Support/typora-user-images/Screenshot 2025-03-12 at 9.45.29 am.png)

### 2.5

Array based list

Array resizing: to solve the problem that array based list has a limited length

When creating an array of referebces to Glorps `(Glorps []) new Object[cap]`, causes a compiler warning which should ignore

Not just use `new Glorp[cap]`, will cause a generic array creation error