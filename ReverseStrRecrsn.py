

def reverse(string):
    if len(string) == 0:
        return string
    else:
        return reverse(string[1:]) + string[0]  #During Comncatenation, Order is so Important..!!!

print(reverse("niti"))
print(reverse("Akash"))