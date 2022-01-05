d={
    'name':'python',
    'fees':4000,
    'duration':'2 months'
}

print(d.get('name'))
print(d['name'])
'''
python
python
'''

for a in d.keys():
    print(a)

'''
name
fees
duration
'''

for a in d.values():
    print(a)

'''
python
4000
2 months
'''

for a,b in d.items():
    print(a,b)

'''
name python
fees 4000
duration 2 months
'''