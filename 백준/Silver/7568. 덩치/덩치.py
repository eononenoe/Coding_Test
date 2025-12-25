n = int(input())
arr = []

for _ in range(n):
    x, y = map(int, input().split())
    arr.append((x, y))

rank = [1] * n

for i in range(n):
    for j in range(n):
        if arr[j][0] > arr[i][0] and arr[j][1] > arr[i][1]:
            rank[i] += 1

print(*rank)
