
import numpy as np
#Array Creation
arr = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(arr)

#-------------------
#Append function--all appends has T.C of O(1)

arr1 = np.append(arr, [[13], [14], [15]], axis=1)
print(arr1)
# it will add each one of these elements vertically

# arr1=np.append(arr,[[13,14,15,16]],axis=0)
# it will add each one of these elements horizontally
# print(arr1)