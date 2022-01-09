#Question5
def printUnorderedPairs(arrayA, arrayB):
    for i in range(len(arrayA)):
        for j in range(len(arrayB)):
            for k in range(0,100000):   #atlast, it is a constant, and constant's T.C is O(1)
                print(str(arrayA[i]) + "," + str(arrayB[j]))#O(1)


'''
a=len(arrayA)
b=len(arrayB)

-   100,000 units of work is still a constant
-   time complexity is O(ab)

'''