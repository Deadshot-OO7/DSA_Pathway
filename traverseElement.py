
import numpy as np

arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
# print(arr)


def traverseElement(arr):
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            print(arr[i][j], end=" ")


traverseElement(arr)
# T.C will be O(mn) , S.C will be O(1), we dont need an extra space for this operation
