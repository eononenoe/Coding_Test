n = int(input())
arr = [] 
for _ in range(n):
    x,y,z = map(int,input().split())
    if x == y == z:
        total = 10000+x*1000
    elif x==y or x==z:
        total = 1000+x*100
    elif y == z:
        total = 1000+y*100
    else:
        total = max(x,y,z)*100
    arr.append(total)
print(max(arr))
