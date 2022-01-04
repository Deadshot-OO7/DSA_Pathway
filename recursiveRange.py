
#n=5 +> 5+4+3+2+1
def recursiveRange(n):
    if n in [0,1]:
        return n
    else:
        return n + recursiveRange(n-1)

print(recursiveRange(1))