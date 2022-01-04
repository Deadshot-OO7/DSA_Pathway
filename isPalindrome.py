
def isPalindrome(string):
    if string == string[-1::-1]:
        return True
    else:
        return False

# print(isPalindrome("nitin"))
print(isPalindrome("nitiN"))