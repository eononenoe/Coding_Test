from collections import deque

n, m = map(int, input().split())
board = []
start = 0

for i in range(n):
    row = list(map(int, input().split()))
    board.append(row)
    for j in range(m):
        if row[j] == 2:
            start = (i, j)

dist = [[-1] * m for _ in range(n)]

q = deque()
x, y = start
q.append((x, y))
dist[x][y] = 0   

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

while q:
    cx, cy = q.popleft()
    
    for i in range(4):
        nx = cx + dx[i]
        ny = cy + dy[i]
        
        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue
        
        if board[nx][ny] == 1 and dist[nx][ny] == -1:
            dist[nx][ny] = dist[cx][cy] + 1
            q.append((nx, ny))

for i in range(n):
    for j in range(m):
        if board[i][j] == 0:
            print(0, end=' ')
        else:
            print(dist[i][j], end=' ')
    print()
