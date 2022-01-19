'''
Write a Python program to get a list, sorted in increasing order by the 
last element in each tuple from a given list of non-empty tuples.   
Sample List : [(2, 5), (1, 2), (4, 4), (2, 3), (2, 1)]
Expected Result : [(2, 1), (1, 2), (2, 3), (4, 4), (2, 5)]
'''

org = [(2, 5), (1, 2), (4, 4), (2, 3), (2, 1), (2, 1), (5, 6)]

l = []
anoth = []
var = 0

for i in range(len(org)):
    l.append(org[i][1])

l.sort()  # [1, 2, 3, 4, 5]

while len(anoth) < len(l):
    for item in org:
        if l[var] == item[1]:
            anoth.append(item)
            org.remove(item)
            var = var+1

print(anoth)
