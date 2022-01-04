'''
Simple nth power of a number
2^3=2*2*2
'''


def powerOfNumber(num, pow):
    assert int(pow) == pow and pow >= 0, "Please provide whole number only!!"
    if pow==0:
        return 1
    if pow == 1:
        return num
    else:
        return num*powerOfNumber(num, pow-1)


num = int(input("Enter a number whose power you wanna calculate\n"))
pow = int(input("Enter power\n"))
result = powerOfNumber(num, pow)
print(f"\nThe {pow}th power of {num} is {result}")
# print(powerOfNumber(2,5))
# print(powerOfNumber(4,3))
