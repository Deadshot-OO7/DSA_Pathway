'''

write a function which makes an array of only strings present in an object

'''

obj2 = {
  "a": 2,
  "b": {"b": 2, "bb": {"b": 3, "bb": {"b": 2}}},
  "c": {"c": {"c": 2}, "cc": 'ball', "ccc": 5},
  "d": 1,
  "e": {"e": {"e": 2}, "ee": 'car'}
}

def collectStrings(obj):
    l=[]
    for key in obj:
        if type(obj[key]) is str:
            l.append(obj[key])
        if type(obj[key]) is dict:
            l.extend(collectStrings(obj[key]))
    return l

print(collectStrings(obj2)) #['ball', 'car']