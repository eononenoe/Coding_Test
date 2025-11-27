n = int(input())
xp,yp = 100,100
for _ in range(n):
    x,y = map(int,input().split())
    if x>y:
        yp-=x
    elif y>x:
        xp-=y
print(xp)
print(yp)
