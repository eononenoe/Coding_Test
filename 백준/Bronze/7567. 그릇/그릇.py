h = 10
d = input()
p = d[0]
for ch in d[1:]:
    if ch == p:
        h +=5
    else:
        h +=10
    p = ch

print(h)