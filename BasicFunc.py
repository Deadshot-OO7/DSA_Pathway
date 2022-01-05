
s = {10, 20, 30, 40}
l = [10, 20, 30, 60]

# set() will typecast to set

# print(set(l))   #{10, 20, 30}

# s.add(50)
# print(s)#{40, 10, 50, 20, 30}

# print(s.pop())#40
# print(s)#{10, 50, 20, 30}

# s.remove(10)
# print(s)
# '''
# {10, 50, 20, 30}
# {50, 20, 30}
# '''

s.update(l)
print(s)  # {40, 10, 20, 60, 30}

s.clear()
print(s)  # set()
