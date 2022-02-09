def f(i, values=[]):
    values.append(i)
    print(values)
    # return values


f(1, [1, 2])
f(2)
f(3)
