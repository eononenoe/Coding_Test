m = int(input())
n = int(input())

arr = []

for i in range(m,n+1):
    if i < 2:
        continue
    for j in range(2,i):
        if i % j == 0:
            break
    else:
        arr.append(i)

if len(arr) == 0: 
    print(-1)
else:
    print(sum(arr))
    print(min(arr))