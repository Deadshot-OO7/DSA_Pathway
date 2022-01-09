#Question2

def printPairs(array):
    for i in array:#O(n2)
        for j in array:#O(n)
            print(str(i)+","+str(j))#O(1)


#O(n2)