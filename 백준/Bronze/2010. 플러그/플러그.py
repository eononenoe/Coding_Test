import sys
input = sys.stdin.readline

n = int(input())
multi = 0

for i in range(n):
    multi += int(input())

print(multi - (n - 1))
