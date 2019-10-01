prices = [800, 700, 900, 198, 330]
totalPrice = 0
for pasta in range(3):
    for drink in range(3,5):
        sumPrice = prices[pasta] + prices[drink]
        if pasta == 0 and drink == 3:
            totalPrice = sumPrice

        if sumPrice < totalPrice:
            totalPrice = sumPrice

print(totalPrice + (totalPrice * 0.1))