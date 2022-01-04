
def productOfArray(arr):
    if len(arr)==0:
        return 1
    else:
        return arr[0]*productOfArray(arr[1:])

print(productOfArray([2,3,4,5])) #120
print(type([2,3,5]))