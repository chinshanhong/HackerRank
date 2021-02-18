import math

N = int(input())
dataSet = str(input()).split(" ")
total =  mean = squaredTotal = standardDeviation = 0

for i in range(0, N):
    dataSet[i] = int(dataSet[i])

for data in dataSet:
    total += data

mean = total / N

for data in dataSet:
    squaredTotal += (data - mean) ** 2

standardDeviation = math.sqrt(squaredTotal / N)

print("%.1f"%(standardDeviation))
