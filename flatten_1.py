'''
arr contains array of arrays, so the aim is to flatten these into single array
ex: [2,3,[1,0]] - > [2,3,1,0]
ex: [[4],5,8,[2,1[3,2[6]]]] - > [4,5,8,2,1,3,2,6]

'''

def flatten(arr):
    if len(arr) == 0:
        return []
    
    if type(arr[0]) == list:
        return  flatten(arr[0]) + flatten(arr[1:])
        
    return [arr[0]] + flatten(arr[1:])