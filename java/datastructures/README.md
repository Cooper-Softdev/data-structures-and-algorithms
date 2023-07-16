# Data Structures

## Implementation Notes

## Code Challenges

# Singly Linked List Implementation in Java

## Table of Contents

1. [Challenge Summary](#challenge-summary)
2. [Challenge Description](#challenge-description)
3. [Approach & Efficiency](#approach-efficiency)
4. [Solution](#solution)
5. [Link to Code](#link-to-code)
6. [Feature Tasks](#feature-tasks)
7. [Testing](#testing)

<a name="challenge-summary"></a>
## Challenge Summary

This challenge involves implementing a singly linked list in Java. The linked list has methods to insert a new node at the head, check if a value exists in the list, and return a string representation of the list.

<a name="challenge-description"></a>
## Challenge Description

The linked list is implemented using a Node class and a LinkedList class. The Node class has properties for the value stored in the Node, and a pointer to the next Node. The LinkedList class includes a head property. Upon instantiation, an empty Linked List is created.

<a name="approach-efficiency"></a>
## Approach & Efficiency

The approach taken was to define the Node and LinkedList classes, and then implement the required methods. The time complexity for the insert operation is O(1) as it involves only a constant amount of work. The includes method has a time complexity of O(n) as it may need to traverse the entire list in the worst case. The toString method also has a time complexity of O(n) for the same reason.

<a name="solution"></a>
## Solution

The solution involves creating a new node and updating the head pointer for the insert operation. For the includes method, the list is traversed until the value is found or the end of the list is reached. The toString method also involves traversing the list and building a string representation of the list.

![Whiteboard Solution](path_to_your_whiteboard_image)

<a name="link-to-code"></a>
## Link to Code

[LinkedList.java]([java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java](https://github.com/Cooper-Softdev/data-structures-and-algorithms/blob/2662c3056014ca90b307ad659461415aab5d00fa/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java))

[Node.java]([java/datastructures/lib/src/main/java/datastructures/linkedlist/Node.java](https://github.com/Cooper-Softdev/data-structures-and-algorithms/blob/af5ef2c93c81adccf55166552a114cc3d3d73d9e/java/datastructures/lib/src/main/java/datastructures/linkedlist/Node.java))

[LinkedListTest.java]([java/datastructures/lib/src/test/java/datastructures/linkedlist/LinkedListTest.java](https://github.com/Cooper-Softdev/data-structures-and-algorithms/blob/af5ef2c93c81adccf55166552a114cc3d3d73d9e/java/datastructures/lib/src/test/java/datastructures/linkedlist/LinkedListTest.java))

<a name="feature-tasks"></a>
## Feature Tasks

- [x] Node class with properties for the value stored in the Node, and a pointer to the next Node.
- [x] LinkedList class with a head property.
- [x] Upon instantiation, an empty Linked List is created.
- [x] insert method that adds a new node with that value to the head of the list with an O(1) Time performance.
- [x] includes method that indicates whether that value exists as a Node’s value somewhere within the list.
- [x] toString method that returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"

<a name="testing"></a>
## Testing

- [x] Can successfully instantiate an empty linked list
- [x] Can properly insert into the linked list
- [x] The head property will properly point to the first node in the linked list
- [x] Can properly insert multiple nodes into the linked list
- [x] Will return true when finding a value within the linked list that exists
- [x] Will return false when searching for a value in the linked list that does not exist
- [x] Can properly return a collection of all the values that exist in the linked list

