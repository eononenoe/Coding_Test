arr = []
for i in range(3):
    arr.append(input())

for i in range(3):
    if arr[i].isdigit():
        num = int(arr[i])
        idx = i
        break

nnum = num + (3 - idx)

if nnum % 15 == 0:
    print("FizzBuzz")
elif nnum % 3 == 0:
    print("Fizz")
elif nnum % 5 == 0:
    print("Buzz")
else:
    print(nnum)