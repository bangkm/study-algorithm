### 문제 출처 - BAEKJOON

-----

### :full_moon: 문제

준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

### :keyboard: 입력

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

### :desktop_computer: 출력

첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

### :keyboard: 예제 입력 1

```py
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
```

### :desktop_computer: 예제 출력 1

```pyt
6
```

### :keyboard: 예제 입력 2

```pyt
10 4790
1
5
10
50
100
500
1000
5000
10000
50000
```

### :desktop_computer: 예제 출력 2

```py
12
```

### :mag_right: 솔루션

동전의 종류를 역순으로 현재 가지고 있는 금액과 비교한다. 동전의 종류가 현재 가지고 있는 금액보다 크면 continue, 작으면  divmod 함수를 사용하여 몫과 나머지를 구해준다

```pyt
a, b = divmod(x, y) # x를 y로 나눈 후, 몫은 a, 나머지는 b 변수에 저장된다
```

몫은 필요한 동전의 개수로 result 변수에 더해주고, 나머지는 필요한 동전만큼 빼고 현재 남은 금액을 나타냄으로 현재 가지고 있는 금액 변수인 haveCash에 저장하여 금액이 0원이 될때까지 반복 후 동전의 갯수를 출력한다.