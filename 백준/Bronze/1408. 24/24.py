now = input()
start = input()
hn,mn,sn = map(int,now.split(":"))
hs,ms,ss = map(int,start.split(":"))

s = ss - sn
if s < 0:
    s = 60 + s
    ms = ms - 1
m = ms - mn
if m < 0:
    m = 60 + m
    hs = hs - 1
h = hs - hn
if h < 0:
    h = 24 + h

print(f"{str(h).zfill(2)}:{str(m).zfill(2)}:{str(s).zfill(2)}")