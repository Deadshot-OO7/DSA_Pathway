
from array import *

arr = array('i', [1, 2, 3, 4, 5, 6])

print(arr.buffer_info())#(address,length) arr.buffer_info[0] = address, arr.buffer_info[1]=length
print(arr.buffer_info()[1]*arr.itemsize)

