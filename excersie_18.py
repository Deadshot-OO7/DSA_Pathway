'''

'''

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
# ['five', 'four', 'one', 'three', 'two']

dict_keys = list(mydict.keys())
dict_values = list(mydict.values())

l = sorted(mydict.values(), reverse=True)
anoth = {}
var = 0
# print(mydict.keys())
while var < len(l):  # var<5
    for item in mydict.values():
        if item is l[var]:
            val = dict_values.index(item)# to find key via value
            key_found = dict_keys[val]
            # print(var)
            anoth[key_found] = mydict[key_found]
            # print(anoth)
    var += 1

print(anoth)
