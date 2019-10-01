n = int(input())
times = list(map(int, input().split()))

times.sort()
sumList = 0

result = []

for time in times:
    sumList += time
    result.append(sumList)

print(sum(result))
