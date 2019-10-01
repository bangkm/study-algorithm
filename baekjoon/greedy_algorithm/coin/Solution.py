kindOfcoine = []
nAndk = list(map(int, input().split()))
haveCash = nAndk[1]
result = 0
for i in range(nAndk[0]):
    kindOfcoine.append(int(input()))

for i in reversed(kindOfcoine):
    if haveCash < i:
        continue
    else:
        a, b = divmod(haveCash, i)
        result += a
        haveCash = b
        
    if haveCash == 0:
        break

print(result)