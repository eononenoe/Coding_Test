while True:
    n = int(input())
    m = []
    if n == -1:
        break
    for i in range(1,n):
        if n % i == 0:
            m.append(i)
    if sum(m)==n:
        divs = " + ".join(str(x) for x in m)
        print(f"{n} = {divs}")
    else:
        print(f"{n} is NOT perfect.")