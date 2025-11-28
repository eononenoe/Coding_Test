from collections import deque

n, m, v = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(n+1):
    graph[i].sort()


def dfs(v):
    vis[v] = True
    print(v, end=' ')
    
    for next_v in graph[v]:
        if not vis[next_v]:
            dfs(next_v)


def bfs(v):
    vis = [False] * (n+1)  
    queue = deque([v])
    vis[v] = True  
    
    while queue:
        now = queue.popleft()
        print(now, end=' ')
        
        for next_v in graph[now]:
            if not vis[next_v]:
                vis[next_v] = True
                queue.append(next_v)


vis = [False] * (n+1)  
dfs(v)  
print()
bfs(v)