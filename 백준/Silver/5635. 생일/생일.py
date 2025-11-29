t = int(input())
who = []
for _ in range(t):
    n,d,m,y = input().split()
    age = y+m.zfill(2)+d.zfill(2)
    who.append((n,age))

old = min(who,key=lambda x: int(x[1]))
young = max(who,key=lambda x: int(x[1]))

print(young[0])
print(old[0])
