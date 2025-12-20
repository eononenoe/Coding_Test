n = int(input())
sum = 0

for i in range(n+1):
    for j in range(n+1):
        if i > j:
            pass
        else:
            sum += i + j
print(sum)