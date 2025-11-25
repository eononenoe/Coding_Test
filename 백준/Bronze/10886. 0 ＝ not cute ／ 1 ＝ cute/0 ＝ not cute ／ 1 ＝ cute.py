n = int(input())
cute = 0
for _ in range(n):
    m = int(input())
    if m>0:
        cute += 1

if cute > n//2:
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")