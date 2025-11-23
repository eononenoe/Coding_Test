x_list = []
y_list = []
for _ in range(3):
    x,y = map(int,input().split())
    x_list.append(x)
    y_list.append(y)

for x1 in x_list:
    if(x_list.count(x1)) == 1:
        result_x = x1
for y1 in y_list:
    if(y_list.count(y1)) == 1:
        result_y = y1

print(result_x,result_y)


