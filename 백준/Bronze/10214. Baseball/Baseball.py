t = int(input())
for _ in range(t):
    yp,kp = 0,0
    for _ in range(9):
        y,k= map(int,input().split())
        yp+=y
        kp+=k
    if yp>kp:
        print("Yonsei")
    elif kp>yp:
        print("Korea")
    else:
        print("Draw")
