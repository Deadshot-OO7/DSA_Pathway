
l = [22, 1, 1, 1, 1, 4, 54, 2, 234, 1, 21, 34, 22, 34, 523, 2, 12, 54]

x = []

for item in l:
    if item in x:
        continue
    else:
        x.append(item)

print(x)
