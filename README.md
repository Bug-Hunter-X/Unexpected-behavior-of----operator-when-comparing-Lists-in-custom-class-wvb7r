# Scala Bug: Unexpected List Comparison

This repository demonstrates a common Scala bug related to comparing lists within a custom class. The `==` operator performs reference equality rather than structural equality for lists. The `bug.scala` file shows the bug in action and `bugSolution.scala` demonstrates the solution.

## Bug Description
The `myMethod` in `MyClass` incorrectly compares `List[Int]` objects using `==`. This returns `false` even if the lists contain the same elements because it compares references rather than the values within the lists.

## Solution
The solution utilizes `equals` method for comparing list elements rather than `==` operator. This solves the issue ensuring that structural equality rather than reference equality is used when comparing list objects.