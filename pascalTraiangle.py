def pascal(n):
    if n==1:
        return [1]
    else:
        line=[1]
        pre_line=pascal(n-1)
        for i in range(len(pre_line)-1):
            line.append(pre_line[i]+pre_line[i+1])
        line+=[1]
    return line

print(pascal(5))
