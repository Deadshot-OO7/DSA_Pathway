'''
Return True if there is a single odd number in the array, otherwise return False. 
The isOdd(num) the function function you use as the callback function -- 
remember that functions can be treated as variables in Python.
[2,3,4,6]->true
[2,4,6]->false
'''


def isOdd(num):
    if num % 2 == 0:
        return False
    else:
        return True


def someRecursive(arr, cb):
    if len(arr)==0:
        return False
    elif cb(arr[0])==False:
        return someRecursive(arr[1:],cb)
    else:
        return True

print(someRecursive([2,3,4],isOdd))