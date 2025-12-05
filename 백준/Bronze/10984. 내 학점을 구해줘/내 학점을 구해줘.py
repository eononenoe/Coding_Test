t = int(input())
for _ in range(t):
    n = int(input())
    gr1 = 0
    gr2 = 0
    for _ in range(n):
        c,g = map(float,input().split()) 
        gr1 += int(c)
        gr2 += c * g
    avg = gr2 / gr1

    print(f"{gr1} {avg:.1f}")
