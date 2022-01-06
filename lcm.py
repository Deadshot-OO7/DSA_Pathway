# import GCD

# def lcm(a,b):
#     return (a*b)//GCD.gcd(a,b)


# print(lcm(18,48))
# print(lcm(48,18))

def lcm(a,b):
    mx=max(a,b)
    mn=min(a,b)
    rem=mx%mn
    if rem==0:
        return mn
    else :
        return mx*lcm(mn,rem)//rem

'''
def LCM(a, b):
  t = a % b
  if t == 0:
        return a
  return a * LCM(b, t) / t
'''

print(lcm(2,10))
print(lcm(2,5))