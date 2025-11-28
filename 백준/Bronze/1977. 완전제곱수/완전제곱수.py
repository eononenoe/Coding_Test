m = int(input())
n = int(input())
li = []
x = 1
while x * x <= n:
    if m <= x*x and x*x <= n:
        li.append(x*x)
    x += 1

if len(li) == 0:
    print(-1)
else:
    print(sum(li))
    print(min(li))