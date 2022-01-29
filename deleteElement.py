
import numpy as np

arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(arr)
# T.C will O(mn) for deletion but S.C will be O(1)
# but T.C will be O(1) if we delete from the end

delArray = np.delete(arr, 0, axis=1)
print(delArray)
