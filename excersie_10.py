'''
Write a Python program to get a string made of the first 2 and the last 2 chars from a given a string. If the string length is less than 2, print an empty string.   
Sample String : 'w3resource'
Expected Result : 'w3ce'
Sample String : 'w3'
Expected Result : 'w3w3'
Sample String : ' w'
Expected Result : Empty String
'''

string = input("Give a string::")


def oneFunc(string):
    if len(string) < 2:
        print("empty string")
    else:
        print(f"{string[0]}{string[1]}{string[-2]}{string[-1]}")


oneFunc(string)
