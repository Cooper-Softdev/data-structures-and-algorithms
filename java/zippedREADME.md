# Zipping Linked Lists

## Summary
This challenge involves merging two linked lists by alternating nodes from each list. If one list is longer, 
the remaining nodes are appended to the end of the merged list.

## Description
Given two linked lists, we need to combine them into a single list where the nodes alternate between the two lists. 
If one list has more nodes than the other, the extra nodes are added to the end of the new list.

## Approach & Efficiency
The approach used here is to iterate through the two lists simultaneously, adding a node from each list to the new list in turn. 
This is done using a while loop that continues as long as there are nodes left in both lists. If one list is exhausted before the other, 
the remaining nodes from the longer list are added to the end of the new list.

The time complexity of this approach is O(n), where n is the total number of nodes in both lists. 
This is because we are visiting each node once. The space complexity is O(1), as we are not using any additional space that scales with the input size.

## Solution
Here is the pseudocode for the solution:

```java
public class LinkedListNode {
    int nodeData;
    LinkedListNode nextNode;
}

public LinkedListNode zipTwoLinkedLists(LinkedListNode headOfFirstList, LinkedListNode headOfSecondList) {
    LinkedListNode headOfZippedList = new LinkedListNode();
    LinkedListNode currentNodeInZippedList = headOfZippedList;

    while (headOfFirstList != null && headOfSecondList != null) {
        currentNodeInZippedList.nextNode = headOfFirstList;
        currentNodeInZippedList = currentNodeInZippedList.nextNode;
        headOfFirstList = headOfFirstList.nextNode;

        currentNodeInZippedList.nextNode = headOfSecondList;
        currentNodeInZippedList = currentNodeInZippedList.nextNode;
        headOfSecondList = headOfSecondList.nextNode;
    }

    if (headOfFirstList != null) {
        currentNodeInZippedList.nextNode = headOfFirstList;
    }

    if (headOfSecondList != null) {
        currentNodeInZippedList.nextNode = headOfSecondList;
    }

    return headOfZippedList.nextNode;
}
```

## Whiteboard

<img width="1409" alt="Screenshot 2023-07-19 at 8 09 36 PM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/b54019d1-7e0e-4497-8bf1-b7a556a9c032">
