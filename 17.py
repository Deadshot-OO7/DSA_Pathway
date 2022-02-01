'''
 Write a Python program to remove all duplicate elements from a given array and returns a new array. Go to the editor
Sample Output:
Original array: 1 3 5 1 3 7 9
After removing duplicate elements from the said array: 1 3 5 7 9
Original array: 2 4 2 6 4 8
After removing duplicate elements from the said array: 2 4 6 8
'''


from array import *
arr = array('i', [1, 3, 5, 1, 3, 7, 9])
arr1 = array('i', [])
for i in set(arr):
    arr1.append(i)

print(arr1)
