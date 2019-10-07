### 문제 출처 - BAEKJOON

------

### :full_moon: 문제

그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

### :keyboard: 입력

첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

### :desktop_computer: 출력

첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

### :keyboard: 예제 입력 1

```python
4 5 1
1 2
1 3
1 4
2 4
3 4
```

### :desktop_computer: 예제 출력 1

```
1 2 4 3
1 2 3 4
```

### :keyboard: 예제 입력 2

```python
5 5 3
5 4
5 2
1 2
3 4
3 1
```

### :desktop_computer: 예제 출력 2

```python
3 1 2 5 4
3 1 4 2 5
```

### :keyboard: 예제 입력 3

```python
1000 1 1000
999 1000
```

### :desktop_computer: 예제 출력 3

```python
1000 999
1000 999
```



### :mag_right: Solution

DFS(Depth First Search)와 BFS(Breadth First Search)의 기초 개념을 잡을 수 있는 문제다. DFS는 깊이 우선 탐색으로 가장 하위 노드까지 탐색 후 다시 올라와 방문하지 않은 노드를 탐색하는 방법이며, BFS는 넒이 우선 탐색으로 자식 노드를 모두 탐색 후 하위 노드로 내려가 탐색하는 방식을 얘기한다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile7.uf.tistory.com%2Fimage%2F993501355C67E8C013E4BA" width="300" height = "300"> <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile7.uf.tistory.com%2Fimage%2F997B6C3D5C67E90823D689" width="300" height="300">

​            DFS(Depth First Search)								BFS(Breadth First Search)

[ 이미지 출처 ] https://this-programmer.com/entry/

위 문제를 해결하기 위해 인접행렬(Adjacency Matrix)를 사용했다. 인접행렬이란 자료형의 일종으로 어느 노드끼리 연결되었는지를 나타내는 이차원 행렬을 의미한다.

연결되어 있지 않은 노드는 0, 연결된 노드끼리는 1의 값을 저장한다.

```python
matrix = [
  				[0, 1, 1, 1],
          [1, 0, 0, 1],
          [1, 0, 0, 1],
          [1, 1, 1, 0]
				 ]
```

- BFS

  탐색을 시작할 노드를 Queue에 저장하고 방문한 노드이므로 footPrint에도 똑같이 저장한다. Queue가 비어있을때 까지 반복문을 통해 노드를 탐색한다. 시작 노드와 같은 수준에 있는 노드를 탐색하고 같은 수준의 모든 노드를 탐색 후 하위 노드로 내려가 탐색을 이어간다. 

- DFS

  탐색을 시작할 노드를 방문한 노드를 저장하는  footPrint에 저장하고 인접행렬을 통해 현재 노드와 연결된 노드를 탐색한다. 연결된 노드가 아직 방문하지 않은 노드라면 재귀호출을 통해 연결된 노드를 추가하고 연결된 노드를 시작 노드로하여 탐색을 이어간다.