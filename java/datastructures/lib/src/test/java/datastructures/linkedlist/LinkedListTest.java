package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

  private final Random rand = new Random();

  @Test
  void canInstantiateEmptyLinkedList() {
    LinkedList list = new LinkedList();
    assertNull(list.headNode);
  }

  @Test
  void canInsertIntoLinkedList() {
    LinkedList list = new LinkedList();
    int randomValue = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue);
    assertNotNull(list.headNode);
    assertEquals(randomValue, list.headNode.nodeValue);
  }

  @Test
  void headPointsToFirstNode() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.insertValueAtHead(randomValue2);
    assertEquals(randomValue2, list.headNode.nodeValue);
  }

  @Test
  void canInsertMultipleNodes() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    int randomValue3 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.insertValueAtHead(randomValue2);
    list.insertValueAtHead(randomValue3);
    assertEquals(randomValue3, list.headNode.nodeValue);
    assertEquals(randomValue2, list.headNode.nextNode.nodeValue);
    assertEquals(randomValue1, list.headNode.nextNode.nextNode.nodeValue);
  }

  @Test
  void returnsTrueWhenValueExists() {
    LinkedList list = new LinkedList();
    int randomValue = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue);
    assertTrue(list.listIncludesValue(randomValue));
  }

  @Test
  void returnsFalseWhenValueDoesNotExist() {
    LinkedList list = new LinkedList();
    int randomValue = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue);
    assertFalse(list.listIncludesValue(randomValue + 1));
  }

  @Test
  void canReturnAllValues() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    int randomValue3 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.insertValueAtHead(randomValue2);
    list.insertValueAtHead(randomValue3);
    String expectedString = "{ " + randomValue3 + " } -> { " + randomValue2 + " } -> { " + randomValue1 + " } -> null";
    assertEquals(expectedString, list.toString());
  }

  @Test
  void testAppend() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.append(randomValue2);
    assertEquals(randomValue2, list.headNode.nextNode.nodeValue);
  }

  @Test
  void testInsertBefore() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    int randomValue3 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.append(randomValue2);
    list.insertBefore(randomValue2, randomValue3);
    assertEquals(randomValue3, list.headNode.nextNode.nodeValue);
  }

  @Test
  void testInsertAfter() {
    LinkedList list = new LinkedList();
    int randomValue1 = rand.nextInt(20) + 1;
    int randomValue2 = rand.nextInt(20) + 1;
    int randomValue3 = rand.nextInt(20) + 1;
    list.insertValueAtHead(randomValue1);
    list.append(randomValue2);
    list.insertAfter(randomValue1, randomValue3);
    assertEquals(randomValue3, list.headNode.nextNode.nodeValue);
  }
}
