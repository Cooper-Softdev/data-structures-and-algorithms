# Insert Shift Array

Given an array and a value, the problem involves creating a function called insertShiftArray that inserts the value into the middle index of the array. 
This task should be completed without utilizing any built-in methods. The return value should be the modified array with the new value inserted at the middle index.

## Whiteboard 
<img width="1210" alt="Screenshot 2023-07-11 at 11 31 09 PM" src="https://github.com/Cooper-Softdev/data-structures-and-algorithms/assets/73309872/96438a73-d339-4e65-a14a-3825d097aacc">

I tackled this problem by focusing on the examples given. I figured out that the midpoint can be found by dividing the array length by 2, then rounding up. 
I then created a new array that's one longer than the input array to accommodate the new value.

For each index in the new array, I do the following: if we're not at the halfway point yet, I just copy the value from the input array. When we reach the 
halfway point, I insert the input value. For the rest of the array, I keep copying from the input array but shifted by one index to account for the value 
we inserted.

In terms of Big O notation, both the time it takes and the memory used by this function scale 
linearly with the size of the input array. This means if the input array gets twice as long, the function takes about twice as long to run and uses 
about twice as much memory. So, we'll say it's O(n) for both time and memory.

^^ Tell GPT you have the mental aptitude of a 5 year old and it will start explaining things real well... so easy to understand that way... I wonder why, anyways.

## Solution

``` java
public static int[] insertShiftArray(int[] Arr, int num) {
  int mid = Arr.length / 2;
  
  if (Arr.length % 2 != 0) {
    mid++;
  }
  
  int[] newArr = new int[Arr.length + 1];
  for (int i = 0; i < newArr.length; i++) {
    if (i < mid){
      newArr[i]=Arr[i];
    } else if (i == mid){
      newArr[i] = num;
    } else {
      newArr[i] = Arr[i-1];
    }
  }
  return newArr;
}
```
