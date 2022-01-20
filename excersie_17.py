'''
 Write a Python program to sort (ascending and descending) a dictionary by keys.  
'''

mydict = {
    'one': "Akash",
    'two': "Abhishek",
    'three': "sneha",
    'four': "Joshi",
    'five': "Cisco"
}

# print(mydict)
l = sorted(mydict, reverse=True)  # ['five', 'four', 'one', 'three', 'two']
anoth = {}
var = 0
# print(mydict.keys())
while var < len(l):  # var<5
    for item in mydict.keys():
        if item is l[var]:
            # print(var)
            anoth[item] = mydict[item]
            # print(anoth)
    var += 1

print(anoth)
