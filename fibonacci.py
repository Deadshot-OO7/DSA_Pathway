'''
Fibonacci Sequence : The sequence commonly starts from 0 and 1, and is the sum of preceding two terms
'''


def fibonacci(index):
    assert index >= 0 and int(index) == index, "Index must be a whole number!!"

    if index in [0,1]:
        return index
    else:
        return fibonacci(index-1) + fibonacci(index-2)

'''
My Approach

def fibonacci(index):
    assert index >= 0 and int(index) == index, "Index must be a whole number!!"

    if index == 0:
        return 0
    elif index == 1:
        return 1
    else:
        return fibonacci(index-1) + fibonacci(index-2)

'''

index = input("Enter the index for fibonacci series")
# fibonacci(index)
# print(fibonacci(7))
print(fibonacci(index))
# print(fibonacci(-3))
