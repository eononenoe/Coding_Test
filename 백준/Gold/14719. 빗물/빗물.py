h,w = map(int,input().split())
blocks = list(map(int,input().split()))

result = 0

for i in range(1,w-1):
    left_max = max(blocks[:i])
    right_max = max(blocks[i+1:])
    water = min(left_max, right_max) - blocks[i]
    if water > 0:
        result += water
        
print(result)