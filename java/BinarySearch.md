## Binary Search

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. 
Without utilizing any of the built-in methods available to your language, return the index of the 
array’s element that is equal to the value of the search key, or -1 if the element is not in the array.

# Whiteboard

<img width="1017" alt="Screenshot 2023-08-06 at 5 36 40 PM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/ab8add8a-8b5b-4923-a8bc-c90346d99406">

# Approach Efficiency

To use binary search on an array, I set initial minimum and maximum indices. I find the array's midpoint and 
compare it to the search value. If they match, I return the index. If not, I adjust my search range based on 
whether the midpoint is larger or smaller. If I can't find the value, I return -1.

The function's time complexity is O(logn) as it halves the search space each time. Its space complexity is 
O(1) since I only use a few variables regardless of input size.

# Solution

``` Java
public static int binarySearch(int[] numbersArray, int targetValue) {
    int startIndex = 0;
    int endIndex = numbersArray.length - 1;

    while (startIndex <= endIndex) {
        int middleIndex = (startIndex + endIndex) / 2;

        if (numbersArray[middleIndex] == targetValue) {
            return middleIndex;
        }
        else if (numbersArray[middleIndex] > targetValue) {
            endIndex = middleIndex - 1;
        }
        else {
            startIndex = middleIndex + 1;
        }
    }

    return -1;
}
```
