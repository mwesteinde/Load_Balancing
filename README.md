Exercise 10 / CPEN 221 / Fall 2019

Load Balancing the Power Grid
=========

One should try to finish this task in about 72 minutes.

## Submission Instructions

+ Submit your work to the Github classroom repository that was created for you.
+ **Do not alter the directory/folder structure. You should retain the structure as in this repository.**
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _I would recommend that you get your Git and Github workflow set up at the start._


## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person in completing the activity.
+ You did not aid any other person in the class in completing their activity.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the activity then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this activity.

> Violations of this honour code will be treated as a case of academic misconduct and will dealt with under UBC policies governing such issues. A consequence of this may be to nullify this exam for everyone that submits work for grading!

# Question: Load Balancing

> The skeleton source code for this question is in the package `powergrid`.

You are responsible for managing the load at three power stations **A**, **B** and **C**. The load at a power station is some quantity of electricity being generated in Kilowatt-Hours.

The load is a result of the demand for electricity and you would like the load to be balanced across the three power stations. If the load increases at some power station, say **A**, then the only way to offset this is by moving some of the load to a different power station, say **B**, which now has lower load, by doubling the load at **B** and reducing the load at **A**. If the load at **A** is `y` and the load at **B** is `x` and `y > x` then you can make the load at **A** `y-x` by increasing the load at **B** to `2 * x`. (Naturally, one can do similar things with **B** and **C**, etc.)

Given the loads at the three power stations, you want to know if the permitted operation can be used in some sequence to rebalance the load such that all power stations eventually have the same load.

Implement the method, in class `PowerGrid`, `boolean canLoadBalance(int a, int b, int c)` that returns `true` if this is possible and `false` otherwise. `a`, `b` and `c`, which are arguments to this method and represent the load at the three power stations. You may assume that all inputs are at least 0.

An example of when this is possible is the case with `a = 10`, `b = 15` and `c = 35`. The following sequence of operations will result in a balanced allocation:

`(10, 15, 35) -> (10, 30, 20) -> (20, 20, 20)`

**Hint**: If you use recursion, think carefully about the termination conditions for the recursion. You do not want to run around in circles. Also, you may want to use a helper method that is recursive rather than make `canLoadBalance` recursive. You can think of this problem as determining whether there is path from an initial state to a final state except that the new vertices are being added as necessary.

### Test Cases

```java
@Test
public void test1() {
	assertTrue(PowerGrid.canLoadBalance(10, 15, 35));
}

@Test
public void test2() {
	assertTrue(!PowerGrid.canLoadBalance(4, 8, 6));
}

@Test
public void test3() {
	assertTrue(PowerGrid.canLoadBalance(40, 40, 40));
}

@Test
public void test4() {
	assertTrue(PowerGrid.canLoadBalance(0, 0, 0));
}

@Test
public void test5() {
	assertTrue(PowerGrid.canLoadBalance(225, 500, 475));
}

@Test
public void test6() {
	assertTrue(!PowerGrid.canLoadBalance(40, 80, 0));
}

@Test
public void test7() {
	assertTrue(!PowerGrid.canLoadBalance(5, 1, 3));
}

@Test
public void test8() {
	assertTrue(!PowerGrid.canLoadBalance(5, 2, 2));
}

@Test
public void test9() {
	assertTrue(PowerGrid.canLoadBalance(7, 2, 3));
}

@Test
public void test10() {
	assertTrue(!PowerGrid.canLoadBalance(7, 5, 3));
}

@Test
public void test11() {
	assertTrue(PowerGrid.canLoadBalance(15, 30, 45));
}

@Test
public void test12() {
	assertTrue(PowerGrid.canLoadBalance(2, 6, 16));
}

```

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes **unless asked to**.
+ You can use additional standard Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.