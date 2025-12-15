n = int(input())

for i  in range(n):
    space = i
    star = 2*n -1 - 2*i
    print(' '*space+'*'*star)

for i in range(n-2,-1,-1):
    space = i
    star = 2*n - 1 - 2*i
    print(' '*space+'*'*star)
