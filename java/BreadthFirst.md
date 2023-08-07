# Breadth First

Write a function called breadth first
Argument input is a tree
Return a list of all values in the tree, in the order of traversal

# Whiteboard Process

<img width="1154" alt="Screenshot 2023-08-06 at 6 21 29 PM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/052ffb00-a4fb-4fc1-b573-3939c20acbf6">

# Approach & Efficiency

Initially, I verify if the tree's root is null. If it is, an exception is thrown. Following that, I establish an empty array 
list for my results and an empty queue. The root is then added to the queue. I then initiate a while loop that continues until 
the queue is devoid of elements. During each iteration, the front of the queue is dequeued, its value is added to the array, 
and its left and right nodes are enqueued. This process continues until the queue is empty, at which point I return the array list.

The runtime complexity of this operation is O(n) because it must visit every node in our tree. The space complexity is also O(n), 
as the size of our array list increases linearly with the size of the tree.

# Solution

``` Java
public List<Integer> performBreadthFirstTraversal() {
    if (root == null) {
        throw new IllegalArgumentException("Empty Tree");
    }

    List<Integer> listOfNodeValues = new ArrayList<>();

    Queue<Node> queueOfNodes = new LinkedList<>();
    queueOfNodes.add(root);

    while (!queueOfNodes.isEmpty()) {
        Node currentNode = queueOfNodes.poll();

        listOfNodeValues.add(currentNode.value);

        if (currentNode.left != null) {
            queueOfNodes.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queueOfNodes.add(currentNode.right);
        }
    }
    return listOfNodeValues;
}
```
