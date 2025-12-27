n = int(input())
arr = set(map(int,input().split()))

m = int(input())
list = list(map(int,input().split()))

for x in list:
    if x in arr:
        print(1)
    else:
        print(0)