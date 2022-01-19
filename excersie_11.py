
'''
Write a Python program to get a string from a given string where all occurrences of its first char have been changed to '$', except the first char itself.   
Sample String : 'restart'
Expected Result : 'resta$t'
'''

string = 'restart'
l = list(string)
print(l)
for i in range(len(l)):
    for j in range(i+1, len(l)):
        if l[i] == l[j]:
            l.pop(j)
            l.insert(j, '$')

print(l)
