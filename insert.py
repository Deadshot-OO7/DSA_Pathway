
import numpy as np


arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(arr)
# print(arr)

#Insert method T.C = O(mn)

# arr1 = np.insert(arr, 0, [[13, 14, 15]], axis=1)
# #will be inserted vertically
# print(arr1)

# arr1 = np.insert(arr, 0, 15)
# if arr = none, then array will be flattened
# print(arr1)

# arr1 = np.insert(arr, 0, [[13, 14, 15, 16]], axis=0)
# we have to include axis=0 for row
# print(arr1)