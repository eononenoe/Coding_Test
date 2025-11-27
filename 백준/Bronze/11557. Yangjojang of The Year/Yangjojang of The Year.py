t = int(input())
for _ in range(t):
    n = int(input())
    uni_li,l_li =[],[]
    for _ in range(n):
        uni,l = map(str,input().split())
        uni_li.append(uni)
        l_li.append(int(l))
    max_li = max(l_li)
    idx = l_li.index(max_li)

    print(uni_li[idx])
