s = input()
total = 0
star_w = 0

for i in range(len(s)):
    w = 1 if i % 2 == 0 else 3
    if s[i] == '*':
        star_w = w
    else:
        total += int(s[i]) * w

for x in range(10):
    if (total + star_w * x) % 10 == 0:
        print(x)
        break
