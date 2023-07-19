package datastructures.linkedlist;

public class LinkedList {
  public Node headNode = null;

  public void insertValueAtHead(int valueToInsert) {
    Node newNode = new Node(valueToInsert);
    newNode.nextNode = headNode;
    this.headNode = newNode;
  }
  public void append(int valueToAppend) {
    Node newNode = new Node(valueToAppend);
    if (headNode == null) {
      headNode = newNode;
    } else {
      Node currentNode = headNode;
      while (currentNode.nextNode != null) {
        currentNode = currentNode.nextNode;
      }
      currentNode.nextNode = newNode;
    }
  }

  public void insertBefore(int valueToFind, int valueToInsert) {
    if (headNode == null) {
      return;
    }
    if (headNode.nodeValue == valueToFind) {
      insertValueAtHead(valueToInsert);
      return;
    }
    Node currentNode = headNode;
    while (currentNode.nextNode != null && currentNode.nextNode.nodeValue != valueToFind) {
      currentNode = currentNode.nextNode;
    }
    if (currentNode.nextNode != null) {
      Node newNode = new Node(valueToInsert);
      newNode.nextNode = currentNode.nextNode;
      currentNode.nextNode = newNode;
    }
  }

  public void insertAfter(int valueToFind, int valueToInsert) {
    Node currentNode = headNode;
    while (currentNode != null && currentNode.nodeValue != valueToFind) {
      currentNode = currentNode.nextNode;
    }
    if (currentNode != null) {
      Node newNode = new Node(valueToInsert);
      newNode.nextNode = currentNode.nextNode;
      currentNode.nextNode = newNode;
    }
  }
  public boolean listIncludesValue(int valueToFind) {
    Node currentNode = this.headNode;
    while (currentNode != null) {
      if (currentNode.nodeValue == valueToFind) {
        return true;
      }
      currentNode = currentNode.nextNode;
    }
    return false;
  }

  public int kthFromEnd(int k) {
    // place pole position 1 (p1) and p2 into headNode
    Node p1 = headNode;
    Node p2 = headNode;
    // p1 iterates the list
    int i = 0;
    while (i < k) {
      if (p1 == null) {
        throw new IllegalArgumentException("k is larger than the list");
      }
      p1 = p1.nextNode;
      i++
    }
    // p2 follows p1 until p1 reaches the end of the list if applicable
    while (p1 != null) {
      p1 = p1.nextNode;
      p2 = p2.nextNode;
    }

    // If node k is found, p2 is now the kth from the end
    return p2.nodeValue;
  }

  @Override
  public String toString() {
    StringBuilder listAsString = new StringBuilder();
    Node currentNode = this.headNode;
    while (currentNode != null) {
      listAsString.append("{ ");
      listAsString.append(currentNode.nodeValue);
      listAsString.append(" } -> ");
      currentNode = currentNode.nextNode;
    }
    listAsString.append("null");
    return listAsString.toString();
  }
}
