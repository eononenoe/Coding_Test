t = int(input())
for _ in range(t):
    arr = []
    arr = input().split()
    result = float(arr[0])
    for o in arr[1:]:
        if o == '@':
            result *= 3
        elif o == '%':
            result += 5
        elif o == '#':
            result -= 7
    print(f"{result:.2f}")
