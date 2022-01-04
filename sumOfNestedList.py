'''
Write a Python program of recursion list sum. Go to the editor
Test Data: [1, 2, [3,4], [5,6]]
Expected Result: 21
'''

def sumList(arr):
    s=0
    for item in arr:
        if type(item) is int:
            s=s+item
        else:
            s=s+sumList(item)
    return s
    
print(sumList([1, 2, [3,4], [5,6]]))