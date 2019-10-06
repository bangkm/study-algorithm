def searchMazeWithBFS( current, destination, matrix ):
    destination_x, destination_y = destination
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    queue = [current]
    footPrint = [current]

    while queue:
        x, y = queue.pop(0)
        xy = matrix[x][y]
        
        for i in range(4):
            x_dx = x + dx[i]
            y_dy = y + dy[i]

            if x_dx < 0 or y_dy < 0 or x_dx >= N or y_dy >= M:
                continue
            isPass = matrix[x_dx][y_dy]

            if isPass == 0:
                continue

            if isPass == 1 or xy + 1 < isPass:
                matrix[x_dx][y_dy] = xy + 1
                queue.append( (x_dx, y_dy) )
    
    return matrix[destination_x][destination_y]

N, M = map(int, input().split())
matrix = []

for _ in range(N):
    matrix.append( list(map(int, input())) )

currentPoint = (0, 0)

print(searchMazeWithBFS(currentPoint, (N-1, M-1), matrix))