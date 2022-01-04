'''
Find Decimal to Binary Notation
'''

'''
#My Approach:-
# Done with the help of empty list to push remainder

l = []
def DecimalToBinary(a):
    assert a > 0 and int(a)==a, "Number must be a positive integer number only!"
    if a//2 != 0:  # if quotient is not equal to 0
        l.append(f'{a%2}')
        return DecimalToBinary(a//2)
    else:
        l.append(f'{a%2}')
        return ' '.join(reversed(l))  # joined list elements contigously
'''

#Trainer approach
def DecimalToBinary(a):
    if a==0:
        return 0
    else:
        return DecimalToBinary(a//2)*10+a%2
print(DecimalToBinary(13))