t = int(input())
for _ in range(t):
    r,e,c = map(int,input().split())
    money = e-r-c
    if money > 0:
        print("advertise")
    elif money < 0:
        print("do not advertise")
    else:
        print("does not matter")
