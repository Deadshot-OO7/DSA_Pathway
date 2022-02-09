'''
a = [1, 2, 3]
b = [4, 5, 6, 7]

c = a + b  # its called list concatenation

print(c)

l = [0, 1]
l = l * 4  # we are repeating list elements by 4
print(l)
'''

# Split function

a = "spam-spam-spam"
delimiter = '-'
b = a.split(delimiter)
print(b)
print(delimiter.join(b))
