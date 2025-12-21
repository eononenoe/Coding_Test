for _ in range(3):
    arr = []
    arr = list(map(int,input().split()))
    if arr.count(0)==1:
        print('A')
    elif arr.count(0)==2:
        print('B')
    elif arr.count(0)==3:
        print('C')
    elif arr.count(0)==4:
        print('D')
    elif arr.count(1)==4:
        print('E')
    