n = int(input())
star = 2*n -1
space = 0
for _ in range(n):
    print(' '*space+'*'*star)
    space += 1
    star -= 2