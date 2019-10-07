number = [0 for _ in range(10)]

N = list(map(int, input()))

total = 0

for i in range(len(N)):
    a = N[i]
    number[a] += 1
    total += a

if 0 not in N or not(total % 3  == 0):
    print(-1)
else:
    result = ''

    for i in range((len(number) - 1), -1, -1):
        while number[i] > 0:
            result += str(i)
            number[i] -= 1

    print(result)