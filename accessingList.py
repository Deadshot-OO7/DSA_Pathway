
list1 = ["milk","cheese","butter"]

print(list1[0])
print(list1[1])
print(list1[2])

# we can check whether an element is present in list or not by "in" operator

print("milk" in list1)
print("shoe" in list1)

# we can use negative indexes to iterate reversely

print(list1[-1])
print(list1[-2])
print(list1[-3])
print(list1[-4])#array index out of range

# Traversing

for i in list1:
    print(i)

for i in range(len(list1)):
    print(list1[i])