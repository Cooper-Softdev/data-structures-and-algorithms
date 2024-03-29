# Code Challenge

## Insertion Sort

### Insertion Sort Overview & Explaination

Insertion sort is a simple sorting algorithm that works by building a sorted array, one element at a time. Similar to sorting a dealt hand of playing cards.
Grab one card and move it to the front, move back through and grab the next card that should follow suit and repeat that process until the sorting is complete.

### Pseudo Code

The following will show the sorting algorithm broken down into steps, starting from the two main functions then we'll iterate it.

-  Insert: This function just inserts a value into it's correct position in the array to be sorted.
-  InsertionSort: This function sorts the input array (dealt hand) by repeatedly calling the "Insert" function until it sees that all elements (cards) are in the correct order. It knows this because we will increment a counter that will stop the algorithm once it reaches the last element/index within the array.

Technically I think the PseudoCode may be wrong in that it doesn't have the logic for placing the next value in the input array into the correct position within the sorted array, the given PseudoCode does not know to insert a larger or smaller number in the correct place, the ``WHILE`` loop in the ``Insert`` function only checks if the value is less than the current element in the sorted array. This means that the value will always be inserted to the right of the current element, even if the value to insert is less than the current element.. So a fixed version will be after the initial input array.

``` Wrong Pseudo Code
Insert(int[] sorted, int value)
  initialize i to 0
  WHILE value > sorted[i]
    set i to i + 1
  WHILE i < sorted.length
    set temp to sorted[i]
    set sorted[i] to value
    set value to temp
    set i to i + 1
  append value to sorted

InsertionSort(int[] input)
  LET sorted = New Empty Array
  sorted[0] = input[0]
  FOR i from 1 up to input.length
    Insert(sorted, input[i])
  return sorted
```

Corrected version of the PseudoCode with easier to follow variable names because I'm not too smart.

``` Correct Pseudo Code
InsertIntoSortedArray(sortedArray, newValue)
  initialize currentPosition to sortedArray.length - 1
  WHILE currentPosition >= 0 AND newValue < sortedArray[currentPosition]
    set sortedArray[currentPosition + 1] to sortedArray[currentPosition]
    decrement currentPosition
  set sortedArray[currentPosition + 1] to newValue

InsertionSortAlgorithm(inputArray)
  LET newArray = New Empty Array of size inputArray.length
  newArray[0] = inputArray[0]
  FOR index from 1 up to inputArray.length - 1
    InsertIntoSortedArray(newArray, inputArray[index])
  return newArray
```

### PseudoCode - Step by Step

1. The `InsertIntoSortedArray` function starts by setting the `currentPosition` variable to the last index of the `sortedArray`. This is the position where the new value will be inserted.
2. The `WHILE` loop checks if the new value is less than the current element in the `sortedArray` and if the `currentPosition` is still within the bounds of the array.
3. If the new value is less than the current element, the current element is shifted to the next position in the `sortedArray`. This is done by assigning the value of the current element to the element at `currentPosition + 1`.
4. The `currentPosition` variable is then decremented to compare the new value with the previous element in the `sortedArray`.
5. This process continues until the correct position for the new value is found or the start of the `sortedArray` is reached. If the correct position is found, the new value is inserted into the `sortedArray` at that position.
6. The `InsertionSortAlgorithm` function initializes the `newArray` with the first element of the `inputArray`. This is the first element in the sorted array.
7. The `InsertionSortAlgorithm` function then iterates over the rest of the `inputArray` and calls the `InsertIntoSortedArray` function for each element. This ensures that each element in the `inputArray` is inserted into the `newArray` in the correct position.
8. Once all elements from the `inputArray` are processed, the `newArray` is returned as the sorted array.


### Step by Step

1. Initial State: Array that gets input into the InsertionSort function will be [8, 4, 23, 42, 16, 15]. And the Sorted array will be initialized and be empty.
<img width="583" alt="Screenshot 2023-08-15 at 8 18 01 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/70a5b468-33b7-4899-9f35-e44333f02074">

2. First Iteration: The first value inside of the array to be sorted is larger than the initalized value of 0 provided in pseudocode so it will always be placed inside the sorted array no matter it's value. This is shown in orange.
<img width="374" alt="Screenshot 2023-08-15 at 8 18 28 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/b5ba6c70-3f03-404a-874a-e6b199034a6e">

3. Second Iteration: The second value found in the input array is a 4, so the algorithm will start at the end of the soon to be sorted array and check the numbers last to first. Checking each number to see if it is larger than or less than. Once it reaches a number it is less than, it will be indexed in front of that number within the array. And the other numbers will be shifted. Shifted numbers are in yellow, and the value causing the shift is shown in red.
<img width="342" alt="Screenshot 2023-08-15 at 8 18 43 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/36dbb51a-4bd9-4dd0-8a23-f7d64784c573">

4. Third and Fourth iteration are the same, the next number is checked starting at the end of the array, it is larger than 8 therefore gets indexed after 8, then 42 is checked and it is larger than 23, therefore gets indexed after 23. Values inserted without changes to values already within the array are in blue.
<img width="313" alt="Screenshot 2023-08-15 at 8 18 50 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/36e8c566-419e-4288-bcf5-40b994e7f027">
<img width="357" alt="Screenshot 2023-08-15 at 8 18 55 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/31a872fe-0512-4f95-ac2c-c05826e216da">

5. Fifth and Sixth iterations are similar to the second, numbers will get shifted to the right until a number found is less than the number to be sorted, and then the number to be sorted will be placed inside the index of the first number it was less than.
<img width="385" alt="Screenshot 2023-08-15 at 8 19 12 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/a01ecc5e-76d8-42fd-af89-7e48ecdfb732">
<img width="419" alt="Screenshot 2023-08-15 at 8 19 22 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/ffbd6f77-b835-4327-82e7-fa56ff5a7f03">

6. Once the last step is complete the input array is now empty and our sorted array is complete and sorted. Congrats.
<img width="429" alt="Screenshot 2023-08-15 at 8 19 35 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/8d563ffe-8b70-4922-b1cd-d730d7506816">

## Working Java code to Insertion Sort (provided by ChatGPT) with correction.

```Java
public class InsertionSort {

    public static int[] insertionSort(int[] input) {
        int[] sorted = new int[input.length];
        sorted[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            insert(sorted, i, input[i]);
        }

        return sorted;
    }

    private static void insert(int[] sorted, int pos, int value) {
        int i = pos - 1;
        while (i >= 0 && value < sorted[i]) {
            sorted[i + 1] = sorted[i];
            i--;
        }
        sorted[i + 1] = value;
    }
}
```
<img width="650" alt="Screenshot 2023-08-15 at 8 49 06 AM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/be2cd623-1a6d-4b33-b0e6-6d70e22e1c6b">
