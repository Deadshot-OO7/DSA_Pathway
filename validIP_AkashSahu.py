
from curses.ascii import isdigit


def validIP(ip_address):
    ip = ip_address
    l = ip.split('.')
    if ip_address.count('.') == 3 and len(l) == 4:
        flag = 0
        for item in l:
            if item.isdigit():
                if int(item) > 255 or int(item) < 0:
                    flag = 1
                    print(f"{ip_address} is NOT valid ip address")
                    break
            else:
                flag = 1
                print("Please provide Only Integers")
                break

        if flag == 0:
            print(f"{ip_address} is Valid ip address")
    else:
        print(f"{ip_address} is NOT valid ip address")


validIP('192.16.2.3')
