# NOTE: zip() function for loop runs only for minimum number of common ele.


# l1=[1,2,3,4]
# l2=[10,20]

# for a,b in zip(l1,l2):
#     print(a,b)
    
'''
1 10
2 20
'''

l1=[1,2,3,4]
l2=[10,20,30,40]

for a,b in zip(l1,l2):
    print(a,b)

'''
1 10
2 20
3 30
4 40'''