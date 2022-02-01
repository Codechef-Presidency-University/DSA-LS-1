# Problem statement-1.
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.<br/>
Complexity:O(1).<br/>
Sample Workflow-1:<br/>
```
Input: nums = [1,1,2] 
Output: 2, nums = [1,2] 
```
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
Sample Workflow-2:<br/>
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
```
Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.

**Note:Online codes, with same syntax variables will not be accepted.**

# Problem statement-2.
Rearrange an array with alternate high and low elements<br/>
Given an integer array, rearrange it such that every second element becomes greater than its left and right elements. Assume no duplicate elements are present in the array.<br/>
Complexity:o(n^2) to O (n^3).<br/>
Sample Workflows-:<br/>
```
Input:  {1, 2, 3, 4, 5, 6, 7}
Output: {1, 3, 2, 5, 4, 7, 6}
 
Input:  {9, 6, 8, 3, 7}
Output: {6, 9, 3, 8, 7}
 
Input:  {6, 9, 2, 5, 1, 4}
Output: {6, 9, 2, 5, 1, 4}
```
Explanation And Algorithm:<br/>
A simple solution would be to sort the array in ascending order first. Then take another auxiliary array and fill it with elements starting from the sorted array’s two endpoints in alternate order. Following is the complete algorithm:<br/>
```
RearrangeArray(arr[], n)
1.Sort the array in ascending order.
2.Take two index variables i and j to that point to two endpoints of the array (i.e., i = 0 and j = n-1).
3.Create an auxiliary array A[] and initialize an index k with 0.
4.Do while (i < j)
    A[k++] = arr[i++]
    A[k++] = arr[j–]
5.Print A[].
```
It doesn’t require any extra space, where n is the size of the input.<br/> 
An efficient solution doesn’t involve sorting the array or the use of extra space. The idea is to start from the second array element and increment the index by 2 for each loop’s iteration. If the last element is greater than the current element, swap the elements. Similarly, if the next element is greater than the current element, swap both elements. At the end of the loop, we will get the desired array that satisfies given constraints.<br/>

# Problem statement-3.
Determine whether an array can be divided into pairs with a sum divisible by `k`.<br/>
Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k.<br/>
Complexity:O(n^2).<br/>
Sample Workflow-1:<br/>
```
Input:
arr[] = { 3, 1, 2, 6, 9, 4 }
k = 5
 
Output: Pairs can be formed
```
Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.<br/>
Sample Workflow-2:<br/>
```
Input:
arr[] = { 2, 9, 4, 1, 3, 5 }
k = 6
 
Output: Pairs can be formed
```
Explanation: Array can be divided into pairs {(2, 4), (9, 3), (1, 5)} where the sum of elements in each pair is divisible by 6.<br/>
Sample Workflow-3:<br/>
```
Input:
arr[] = { 3, 1, 2, 6, 9, 4 }
k = 6
 
Output: Pairs cannot be formed
```
Explanation: Array cannot be divided into pairs where the sum of elements in each pair is divisible by 6.<br/>

Algorithm:
A naive solution is to iterate over array arr and consider each element arr[i] as the first element of a pair. Then process the remaining elements to find the first non-visited element `arr[j]` which satisfies the relation `(arr[j] + arr[i]) % k == 0`.If a pair is found for all elements, return true; otherwise, return false.<br/>
# How to submit your solution.
1.File name: ps_rollno_solution. (eg. ps_cse0xxx_solution.) with extension.<br/>
2.(For coders in java): Please note your class name should be (class solution_0xxx)... and so on.<br/>
3.After your code, comment your Name,Roll No, and section.(i.e, where the main function ends, or after the last line of code.)<br/>
4.Commit your code to solutions folder in the repository.<br/>

# ALL THE BEST!!! (Happy Coding).
