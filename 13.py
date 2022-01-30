
from array import *


arr = array('i', [4, 3, 2, 1, 5, 1, 2, 3])

distArr = array('i', [])
distArr = set(arr)

for i in distArr:
    arr.remove(i)

if len(arr) == 0:
    print(-1)
else:
    print(arr[0])

'''
def find_first_duplicate(nums):
    num_set = set()
    no_duplicate = -1

    for i in range(len(nums)):
        if nums[i] in num_set:
            return nums[i]
        else:
            num_set.add(nums[i])    #adding ele in empty set, as soon as one ele gets repeated,
                                    #this.function() return that ele
    return no_duplicate

print(find_first_duplicate([1, 2, 3, 4, 4, 5]))
'''