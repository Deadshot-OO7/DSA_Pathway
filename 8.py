
from array import *

arr = array('i', [1, 2, 3, 4])
# print(type(arr))
print(arr)
newArr = array('i', [])
newArr.fromlist(arr.tolist())#converting first, array to list, & then we r appending that list

print(newArr)
