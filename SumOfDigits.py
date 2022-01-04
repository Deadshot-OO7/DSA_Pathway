'''
Find the sum of digits of a positive integer number 
let say Number=3472
then output should be 3+4+7+2=16
'''

# def sumOfDigit(num):
#     assert num>=0 and int(num)==num,"THe number has to be a whole number"
#     if int(num/10)==0:
#         return num
#     else:
#         return num%10 + sumOfDigit(num//10)
#         # return num%10 + sumOfDigit(int(num/10)) #we can use num//10 for integer division

# print(sumOfDigit(3))
# # print(sumOfDigit(-4))

s="Akash is smart"

for i in reversed(s):
    print(i,end="")