price = int(input())
changes = [500, 100, 50, 10, 5, 1]

change = 1000 - price

result = 0

for i in changes:
    if change < i:
        continue
    else:
        a, b = divmod(change, i)
        result += a
        change = b

    if change == 0:
        break

print(result)
        