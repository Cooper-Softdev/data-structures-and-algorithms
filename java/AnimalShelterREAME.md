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
public class AnimalShelter {
    private Queue<Dog> dogs = new LinkedList<>();
    private Queue<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else {
            throw new IllegalArgumentException("Animal should be a dog or a cat");
        }
    }

    public Animal dequeue(String pref) {
        if (pref.equals("dog")) {
            return dogs.isEmpty() ? null : dogs.remove();
        } else if (pref.equals("cat")) {
            return cats.isEmpty() ? null : cats.remove();
        } else {
            return null;
        }
    }
}
```
