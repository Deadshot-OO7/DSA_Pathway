'''
Very Nice Question

arr contains array of arrays, so the aim is to flatten these into single array
ex: [2,3,[1,0]] - > [2,3,1,0]
ex: [[4],5,8,[2,1[3,2[6]]]] - > [4,5,8,2,1,3,2,6]

The append() method adds an item to the end of the list

The extend() method adds all the elements of an iterable (list, tuple, string etc.) 
to the end of the list.
'''

def flatten(arr):
    fl=[]
    s=0
    for item in arr:
        if type(item) == list:
            fl.extend(flatten(item))
        else:
            fl.append(item)
    return fl


   


arr=[[2],3,[1,4]]
print(flatten([[2],3,[1,4]]))
