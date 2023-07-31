# Brackets

## Write a function to validate brackets

Argument is a string
Return a boolean representing whether or not the brackets in the string are balanced
There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}


## Whiteboard Process

<img width="1136" alt="Screenshot 2023-07-31 at 10 20 58 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/03ba6d6e-13b8-479b-b7bb-05a3d1cf523b">


## Approach & Efficiency

Whenever we encounter an opening bracket, we push it onto a stack for comparison purposes. The key is to preserve the order of brackets. When we come across a closing bracket, it should correspond to the bracket at the top of the stack. Hence, we just need to compare (and subsequently remove) the top element of the stack with the current closing bracket. If there's a discrepancy, we can immediately return false as the brackets are not properly balanced. Ultimately, the stack should be empty if all brackets are correctly matched.

The complexity of this function is O(N) for both space and time, as it scales linearly with the length of the input string. This is because each character in the string is processed once and may be stored on the stack.
