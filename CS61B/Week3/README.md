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