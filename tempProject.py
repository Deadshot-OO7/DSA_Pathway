

n = int(input("How many day's temperature do you want::"))
# print(n)

temp = []

for i in range(n):
    t = int(input(f"Enter day's {i+1} temperature::"))
    temp.append(t)

avgTemp = round(sum(temp)/len(temp), 2)
print("Average temperature is ::", avgTemp)
count = 0
for i in temp:
    if(avgTemp > i):
        count += 1

if count>1:
    print(f"{count} days are above average temperature")
else:
    print(f"{count} day is above average temperature")

