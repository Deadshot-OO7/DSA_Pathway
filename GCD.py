'''
Find the greatest positive number which can divide the number with 0 remainder
'''

'''
Highest Divisor of a number

def gcd(n):
    flag=True
    for i in range(2,n):
        if n%i==0:
            flag=False
            gtr=i
    if flag==True:
        return n
    else:
        return gtr

print(gcd(454))

'''

# Will use euclidean algorithm to find gcd


def gcd(a, b):
    assert int(a)==a and int(b)==b,"Number must be an integers..!"
    if a<0:
        a=-1*a
    if b<0:
        b=-1*b
    
    if b==0:
        return a
    else:
        rem = a % b
        if rem == 0:
            return b
        else:
            return gcd(b,rem)


print(gcd(18,4.8))
print(gcd(18,48))
print(gcd(18,0))
