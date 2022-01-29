
import numpy as np

arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])


def searchElement(arr, ele):
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if arr[i][j] == ele:
                return "element found at index [" + str(i) + "] [" + str(j) + "]"
    return "Element not found"


print(searchElement(arr, 4))
# T.C will be O(mn) , S.C will be O(1), we dont need an extra space for this operation
