h = 0
arr = []
for i in range(4):
    a,b = map(int,input().split())
    h += b
    h -= a
    arr.append(h)

print(max(arr))