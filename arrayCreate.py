
from array import *
from audioop import reverse

arr = array('i', [1, 2, 3, 4, 5, 6])

# for i in arr:
#     print(i)

# Accessing individual elements through indices
# for i in range(len(arr)):
#     print(arr[i])

# demo of appending method
# arr.append(7)
# print(arr)
# T.C will be O(1)

# demo for insert method
# arr.insert(3, 10)
# print(arr)
# The time complexity to insert an element at a given index is O(n).

# Extend function, It must be ITERABLE
# arr.extend([11, 12, 13, 14])
# print(arr)

# FromList function
# tempList = [11, 12, 13]
# arr.fromlist(tempList)
# print(arr)

# remove function
# arr.remove(2)
# print(arr)

# pop function
# arr.pop()
# print(arr)

# index function()
# print(arr.index(3))

# reverse function
# arr.reverse()
# print(arr)

# Return a tuple(address, length) giving the current memory address
# and the length in items of the buffer used to hold array's contents.
# print(arr.buffer_info())  #O/P -- (4334779248, 6)

# Return number of occurrences of v in the array.
# print(arr.count(4))

# toBytes() -- Convert the array to an array of machine values and return the bytes representation
# print(arr.tobytes()) #b'\x01\x00\x00\x00\x02\x00\x00\x00\x03\x00\x00\x00\x04\x00\x00\x00\x05\x00\x00\x00\x06\x00\x00\

# toList function converts an array to list
# print(arr)
# print(arr.tolist())

# slicing of elements
# print(arr)
# print(arr[3:])
# print(arr[:3])
# print(arr[2:4])
