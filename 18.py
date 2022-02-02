'''
zWrite a Python program to find the missing number in a given array of numbers between 10 and 20. Go to the editor
Sample Output:
Original array: 10 11 12 13 14 16 17 18 19 20
Missing number in the said array (10-20): 15
Original array: 10 11 12 13 14 15 16 17 18 19
Missing number in the said array (10-20): 20
'''


from array import *
arr = array('i', [10, 11, 12, 13, 14, 16, 17, 18, 19, 20])
# arr = array('i', [10, 11, 12, 13, 14, 15, 16, 17, 18, 19])

for i in range(10, 21):
    if arr.count(i) == 0:
        print(i)
