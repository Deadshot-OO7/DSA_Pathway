
from random import *

print(randint(1,3))#1 or 2 or 3
#both included

print(randrange(1,3))#1 or 2
#3 is not Included

l=[10,20,30,40]
print(choice(l))#RETURNS RANDOM ELE FROM A LIST

print(random())#0.00135...

shuffle(l)
print(l)#[20, 10, 40, 30]

print(uniform(3,4))#3.2626119016628383
#returns random value between 3 and 4 but in float data type

