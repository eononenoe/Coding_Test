a = int(input())
total = 0
count = 0
i = 1

while total + i <= a:
    total += i
    count += 1
    i += 1

print(count)
