

import numpy as np

arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(arr)


def accessElement(array, rowIndex, colIndex):
    if rowIndex >= len(array) or colIndex >= len(array[0]):
        print("Incorrect index")
    else:
        print(array[rowIndex][colIndex])

# T.C is O(1) as well as S.C
accessElement(arr, 2, 3)
