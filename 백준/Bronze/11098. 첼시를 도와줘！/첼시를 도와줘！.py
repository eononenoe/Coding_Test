t = int(input())
for _ in range(t):
    p = int(input())
    pli = []
    for _ in range(p):
        c,n = input().split()
        c = int(c)
        pli.append((c,n))

    max_c,max_n = max(pli)
    print(max_n)

    