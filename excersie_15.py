'''
Write a Python function that takes a list of words and
 returns the length of the longest one.   
'''

string = input("Give a string::")
# print(string)
l = string.split(' ')
# print(l)
longest = len(l[0])
print(longest)
for item in l[1:]:
    if len(item) > longest:
        longest = len(item)

print(longest)
