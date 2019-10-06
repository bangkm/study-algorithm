N, M, V = map(int, input().split())
matrix = [[0] * (N + 1) for _ in range(N + 1)]

for _ in range(M):
    edge = list(map(int, input().split()))
    matrix[edge[0]][edge[1]] = 1
    matrix[edge[1]][edge[0]] = 1

def dfs( currentNode, row, footPrints ):
    footPrints += [currentNode]

    for search_node in range(len(row[currentNode])):
        if row[currentNode][search_node] and search_node not in footPrints:
            footPrints = dfs(search_node, row, footPrints)
    return footPrints

def bfs( start ):
    queue = [start]
    footPrints = [start]

    while queue:
        currentNode = queue.pop(0)
        for search_node in range(len(matrix[currentNode])):
            if matrix[currentNode][search_node] and search_node not in footPrints:
                footPrints += [search_node]
                queue += [search_node]
    return footPrints

print(*dfs(V, matrix, []))
print(*bfs(V))