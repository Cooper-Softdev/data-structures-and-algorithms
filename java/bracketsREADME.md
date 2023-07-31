Brackets
Write a function called validate brackets

Arguments: string
Return: boolean representing whether or not the brackets in the string are balanced
There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}
Whiteboard Process
Whiteboard

Approach & Efficiency
Any time we hit a left sided bracket we can push them into a comparison stack. As long as we maintain order, anytime we hit a right sided bracket, the top of the stack needs to match that character or else we have mismatching brackets. Therefore we simply need to compare the top of the stack (and pop it off the stack) to our current right sided character. If we ever hit a mismatch we can return false. At the end, our stack needs to be empty as well.

This function O(N) for both memory and time as it will scale linearly with the size of our input string.
