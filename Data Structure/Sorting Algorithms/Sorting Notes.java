Sorting algo

*** Bubble Sort ***

1. Place the largest element at its position, this operation makes sure that the 
   first largest element will be placed at the end of the array.
2. Recursively call for rest n – 1 elements with the same operation and 
   place the next greater element at their position.
3. The base condition for this recursion call would be, when the number of elements 
   in the array becomes 0 or 1 then, simply return (as they are already sorted).
  
int arr[]= {8, 5, 6, 3, 2, 4};
Elements of array :8 6 5 3 4 2
Elements of array :8 6 5 4 3 2
Elements of array :8 6 5 4 3 2
Sorted array :
Elements of array :8 6 5 4 3 2

----------------------------------------------------------------------

*** Selection Sort: ***
1. Initialize minimum value(min_idx) to location 0.
2. Traverse the array to find the minimum element in the array.
3. While traversing if any element smaller than min_idx is found 
   then swap both the values.
4. Then, increment min_idx to point to the next element.
5. Repeat until the array is sorted.

int arr[]= {8, 5, 6, 3, 2, 4};
Elements of array :2 5 6 3 8 4
Elements of array :2 3 6 5 8 4
Elements of array :2 3 4 5 8 6
Elements of array :2 3 4 5 8 6
Elements of array :2 3 4 5 6 8

Sorted array :
Elements of array :2 3 4 5 6 8

----------------------------------------------------------------------
