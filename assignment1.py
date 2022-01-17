

def prim(n):
    flag = 0
    for i in range(2, n):
        if(n % i == 0):
            print("Not prime and divide by ", i)
            flag = 1
            break
    if(flag == 0):
        print("Yes,It is a prime prime")


def armstrong(n):
    org = n
    s = 0
    while(n):
        s = s+(n % 10)**3
        n = n//10
    if(org == s):
        print(f"{n} is armstrong")
    else:
        print("Not armstrong number")


def perfectNum(n):
    a = 1
    for i in range(2, n):
        if n % i == 0:
            a += i
    if(a == n):
        print(f"Yes {n} is a perfect number")
    else:
        print("No its not a perfect number")


def isEven(n):
    if i % 2 == 0:
        print(f"{i} is Even")
    else:
        print(f"{i} is Odd")


def uglyNumber(n):
    if n == 1:
        print("Yes its a ugly number")
    elif n % 2 == 0:
        uglyNumber(n/2)
    elif n % 3 == 0:
        uglyNumber(n/3)
    elif n % 5 == 0:
        uglyNumber(n/5)
    else:
        print("Not a ugly number")


l = [3, 5, 9, 6, 23, 11, 496, 153, 350, 300, 371, 370, 28, 65]
l1 = [23, 44]
for i in l:
    print("**************")
    isEven(i)
    prim(i)
    armstrong(i)
    perfectNum(i)
    uglyNumber(i)
    print("**************")
