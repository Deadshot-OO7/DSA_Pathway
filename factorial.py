
def factorial(n):
    assert n>=0 and n == int(n),"The number should be either an positive integer or 0! "
    if n in [0,1]:    #if n==0 or n==1  <-- this can also be used
        return 1
    else:
        return n*factorial(n-1)


# print(factorial(4))
# print(factorial(0))
'''
# print(factorial(4)) throws error
print(factorial(3.4))

'''

print(factorial(10))