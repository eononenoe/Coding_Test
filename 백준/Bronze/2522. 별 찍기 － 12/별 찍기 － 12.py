n = int(input())
star = 1
space = n - 1

for i in range(n):
    print(' ' * space + '*' * star)
    space -= 1
    star += 1

space = 1
star = n - 1

for i in range(n - 1):
    print(' ' * space + '*' * star)
    space += 1
    star -= 1
