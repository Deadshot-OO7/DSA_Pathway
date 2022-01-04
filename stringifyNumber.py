

def stringifyNumber(obj):
    newObj=obj
    for key in newObj:
        if type(newObj[key]) is int:
            newObj[key] = str(newObj[key])
        elif type(newObj[key]) is dict:
            newObj[key] = stringifyNumber(newObj[key])

    return newObj

