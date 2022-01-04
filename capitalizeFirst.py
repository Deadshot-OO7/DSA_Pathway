'''

['car','taco','bat'] - > ['Car','Taco','Bat']

'''


'''
This function is not recursive at all..!!


def capitalizeFirst(arr):
    a=[]
    for item in arr:
        a.append(item.title())
    return a

b=['car','taco','bat']
print(capitalizeFirst(['car','taco','bat']))
'''

#Recursive Function
def capitalizeFirst(arr):
    if len(arr)==0:
        return []
    
    return [arr[0].title()] + capitalizeFirst(arr[1:])

print(capitalizeFirst(['cat','bst','Dance']))

