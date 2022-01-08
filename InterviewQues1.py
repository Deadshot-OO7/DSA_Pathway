#Question1
def foo(array):
    sum = 0             #O(1)
    product = 1         #O(1)
    for i in array:     #O(n)
        sum += i        #O(1)
    for i in array:     #O(n)
        product *= i    #O(1)
    print("Sum = "+str(sum)+", Product = "+str(product))    #O(1)

ar1 = [1,2,3,4]
foo(ar1)

#   Time Complexity will be O(n)