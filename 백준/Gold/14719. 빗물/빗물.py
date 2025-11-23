h,w = map(int,input().split())
blocks = list(map(int,input().split()))

result = 0

for i in range(1,w-1):
    left = max(blocks[:i])
    right = max(blocks[i+1:])
    water = min(left,right)-blocks[i]
  
    if water > 0:
        result += water

print(result)