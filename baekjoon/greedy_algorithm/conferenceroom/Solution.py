n = int(input())

conferences = sorted([list(map(int, input().split())) for i in range(n)], key=lambda x: (x[1], x[0]))

endTime = result = 0

for conference in conferences:
    if endTime <= conference[0]:
        endTime = conference[1]
        result += 1

print(result)