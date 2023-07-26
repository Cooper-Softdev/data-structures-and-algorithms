# AnimalShelter

The AnimalShelter class is designed to manage a collection of animals, specifically dogs and cats. It employs two queue instances, one for each animal type, to maintain the order of arrival of the animals. The class provides two primary methods: enqueue for adding animals to the shelter, and dequeue for adopting them out.

## Approach and Efficiency
The AnimalShelter class operates using two distinct queues: dogQueue and catQueue. When an animal is introduced into the shelter, 
the enqueue method determines its species and places it into the corresponding queue. This approach ensures that the first-in, 
first-out principle is upheld for each animal type independently.

The enqueue method operates with a time complexity of O(1), as it merely involves adding an element to the end of a queue.

The dequeue method, on the other hand, requires a preference parameter, which specifies the desired animal type for adoption 
(either "dog" or "cat"). The method then removes and returns the earliest entry of the specified type from the shelter. If the preference 
does not match "dog" or "cat", the method returns null. Similar to enqueue, the dequeue method also operates with a time complexity of O(1), 
as it involves removing the first element from a queue.

In terms of space complexity, both the enqueue and dequeue methods operate at O(1), as they do not require additional space that scales 
with the size of the input. The overall space complexity of the AnimalShelter class is O(n), where n represents the total number of animals in the shelter.
## Whiteboard

<img width="1270" alt="Screenshot 2023-07-26 at 9 13 44 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/7b2d6bb3-2923-4ce4-88bf-d5a692a93188">

## Solution Code

``` Java
import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<String> dogs;
    private Queue<String> cats;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }

    public void enqueue(String animal, String name) {
        if (animal.equalsIgnoreCase("dog")) {
            dogs.add(name);
        } else if (animal.equalsIgnoreCase("cat")) {
            cats.add(name);
        } else {
            throw new IllegalArgumentException("This animal shelter only accepts dogs and cats.");
        }
    }

    public String dequeue(String pref) {
        if (pref.equalsIgnoreCase("dog")) {
            return dogs.poll();
        } else if (pref.equalsIgnoreCase("cat")) {
            return cats.poll();
        } else {
            return null;
        }
    }
}

```
