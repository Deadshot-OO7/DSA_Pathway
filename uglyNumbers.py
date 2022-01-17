
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
        print("Not a ugly nnumber")


uglyNumber(132)
