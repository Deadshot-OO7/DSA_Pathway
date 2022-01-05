d={
    'name':'python',
    'fees':4000,
    'duration':'2 months'
}

# del d['fees']
# print(d)#{'name': 'python', 'duration': '2 months'}

print(d.pop('name'))#python
print(d)#{'fees': 4000, 'duration': '2 months'}

