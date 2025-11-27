a = 300
b = 60
c = 10
t = int(input())


if t % 10 != 0:
    print(-1)
else:
    ac = t // a
    t = t%a

    bc = t // b
    t = t%b

    cc = t // c
    t = t%c
    print(ac,bc,cc)
