'''
Write a Python program to calculate the harmonic sum of n-1. Go to the editor
Note: The harmonic sum is the sum of reciprocals of the positive integers.
Example :
harmonic series

1+1/2+1/3+1/4+1/5...

'''

def harmonicSum(n):
    assert n>=1 ,"Numberr should be positive integer number"
    if n==1: #if n<2
        return 1
    else:
        return 1/n + harmonicSum(n-1)

print(harmonicSum(7))
print(harmonicSum(4))