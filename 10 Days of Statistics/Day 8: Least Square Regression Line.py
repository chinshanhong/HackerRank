n = 5
x = [95, 85, 80, 70, 60]
y = [85, 95, 70, 65, 70]
sumX = sumY = sumX2 = sumXY = meanX = meanY = 0

for i in range(n):
    sumX += x[i]
    sumY += y[i]
    sumX2 += x[i] * x[i]
    sumXY += x[i] * y[i]

meanX = sumX / n
meanY = sumY / n

b = (n * sumXY - sumX* sumY) / (n * sumX2 - sumX ** 2)
a = meanY - b * meanX
X = 80
Y = a + b * X
print("%.3f"%Y)
