'''
Write a Python program to concatenate following dictionaries to create a new one.  
Sample Dictionary : 
dic1={1:10, 2:20} 
dic2={3:30, 4:40} 
dic3={5:50,6:60}
Expected Result : {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}
'''
dic1 = {1: 10, 2: 20}
dic2 = {3: 30, 4: 40}
dic3 = {5: 50, 6: 60}
mydict = {}
dict_keys = list(dic1.keys())
dict_keys.extend(list(dic2.keys()))
dict_keys.extend(list(dic3.keys()))

dict_values = list(dic1.values())
dict_values.extend(list(dic2.values()))
dict_values.extend(list(dic3.values()))
print(dict_keys)
print(dict_values)

for i in range(len(dict_keys)):
    mydict[dict_keys[i]] = dict_values[i]

print(mydict)

s = "Hello my im name is akash and im a good boy"
n = s.count('km')
print(n)
