'''
Write a Python program to find whether a given array of integers 
contains any duplicate element. Return true if any value app
at least twice in the said array and return false if every element is distinct
'''

from array import *

arr = array('i', [1, 2, 3, 4, 5, 5, 5])
# print(setArr)


# def isDistinct(arr):
#     for i in range(len(arr)-1):
#         for j in range(i+1, len(arr)):
#             if arr[i] == arr[j]:
#                 return 'True'
#     return 'False'

def testDuplicate(arr):
    distArray = set(arr)  # Build an unordered collection of UNIQUE elements.
    return len(distArray) != len(arr)


print(testDuplicate(arr))
# print(isDistinct(arr))
