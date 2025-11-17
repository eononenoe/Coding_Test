n, m = map(int,input().split())
castle = [input() for _ in range(n)]

row_cnt = 0
for row in castle:
    if 'X' not in row:
        row_cnt += 1

col_cnt = 0
for c in range(m):
    safe = True
    for r in range(n):
        if castle[r][c] == 'X':
            safe = False
            break
    if safe:
        col_cnt += 1

print(max(row_cnt, col_cnt))
