k,n,m = map(int,input().split())
x = k*n

if m>x:
    print(0)
else:
    print(x-m)
