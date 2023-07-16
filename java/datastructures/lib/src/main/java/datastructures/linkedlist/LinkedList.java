package datastructures.linkedlist;

public class LinkedList {
  public Node headNode = null;

  public void insertValueAtHead(int valueToInsert) {
    Node newNode = new Node(valueToInsert);
    newNode.nextNode = headNode;
    this.headNode = newNode;
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

