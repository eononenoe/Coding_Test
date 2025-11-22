a = int(input())
i = 2

while i * i <= a:
    if a % i == 0:
        print(i)
        a = a // i
    else:
        i += 1

if a > 1:
    print(a)
