# Fizz Buzz Tree

Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, 
but the values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, turn the number into a String.

# Whiteboard

<img width="1101" alt="Screenshot 2023-08-06 at 7 44 57 PM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/f39e03fd-7426-4bba-8426-4e274bee996b">

# Approach & Efficiency 

Write a function that computes the FizzBuzz value for a given integer. Additionally, a primary function that takes in the root of the tree and returns a new tree node. This function constructs a new string node and then recursively processes all child nodes of the current node. The end result is the root of the transformed tree.

# Solution
```java
public static KaryNode<String> transformToFizzBuzzTree(KaryNode<Integer> rootNode){
    if (rootNode == null) {return null;}
    KaryNode<String> transformedNode = new KaryNode<>(computeFizzBuzzEquivalent(rootNode.getValue()));
    for (KaryNode<Integer> individualChild : rootNode.children) {
      transformedNode.children.add(transformToFizzBuzzTree(individualChild));
    }
    return transformedNode;
}

public static String computeFizzBuzzEquivalent(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(number);
    }
}
```
