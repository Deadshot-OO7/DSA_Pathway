'''
Write a Python program to find a pair with highest product from a given array of integers. Go to the editor
Original array: [1, 2, 3, 4, 7, 0, 8, 4]
Maximum product pair is: (7, 8)
Original array: [0, -1, -2, -4, 5, 0, -6]
Maximum product pair is: (-4, -6)
'''

from array import *

arr = [1, 2, 3, 4, -8, -9, 7, 0, 8, 4]
# arr = [0, -1, -2, -4, 5, 0, -6]
setArr = set(arr)
l = []
l.extend(setArr)
l.sort()

if l[0]*l[1] < l[-1]*l[-2]:
    print(f" ({l[-2]},{l[-1]}) ")
else:
    print(f" ({l[0]},{l[1]}) ")





# print(len(setArr))
