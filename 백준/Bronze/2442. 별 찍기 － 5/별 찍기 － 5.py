n = int(input())
star = 1
space = n -1 
for _ in range(n):
    print(' '*space+'*'*star)
    space -= 1
    star += 2