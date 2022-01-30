from array import *

arr = array('i', [1, 2, 3, 4, 5, 6])
newArr = array('i', [12, 23, 34])
# arr.extend([12, 23, 34])
arr.extend(newArr)
print(arr)
