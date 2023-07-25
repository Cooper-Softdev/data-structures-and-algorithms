# PseudoQueue

Create a new class called pseudo queue. It will use 2 instances of a stack to create and manage the queue. 
Create an Enqueue and a Dequeue method for this new class to utilize.

## Approach and Efficiency

In the PseudoQueue class, we've got two main players: stackOne and stackTwo. StackOne is our go-to for adding values to the queue. 
But, because it's a "last in, first out" kind of deal, we need to bring in stackTwo to flip the script when we want to remove the 
first value we added to stackOne.

Now, when it comes to efficiency, all of our methods are pretty quick, running at O(1) time complexity. The one exception is our 
dequeue method. Because we have to move each value individually from stackOne to stackTwo and then back again, the time it takes 
scales linearly with the size of our queue. So, the bigger the queue, the longer it takes, making it an O(n) operation.

## Whiteboard

<img width="1155" alt="Screenshot 2023-07-25 at 8 39 01 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/0901783b-b4d3-4e4a-a7bb-431d166bb6ab">

## Solution code

``` Java
public class PseudoQueue<T> {
    Stack<T> stackOne;
    Stack<T> stackTwo;

    public void enqueue(T value) {
        if (stackOne == null) {
            stackOne = new Stack<>();
        }
        stackOne.push(value);
    }

    public T dequeue() {
        if (stackOne.isEmpty() || stackOne == null) {
            throw new IllegalStateException("PseudoQueue is empty.  Can not dequeue.");
        }
        if (stackTwo == null) {
            stackTwo = new Stack<>();
        }
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        T dequeueVal = stackTwo.pop();
        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return dequeueVal;
    }
}
```
