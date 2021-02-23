n = int(input())
X =  [float(x) for x in input().strip().split()]
Y = [float(y) for y in input().strip().split()]
sumX = sumY = meanX = meanY = stdvX = stdvY = result = 0

#find the sum of the values of each data set
for i in range(n):
    sumX += X[i]
    sumY += Y[i]
    
#find the mean
meanX = sumX / n
meanY = sumY / n

#find the standard deviation
for i in range(n):
    stdvX += (X[i] - meanX) ** 2
    stdvY += (Y[i] - meanY) ** 2
stdvX = (stdvX / n) ** 0.5
stdvY = (stdvY / n) ** 0.5

#find the result by using Pearson correlation coefficient formula
for i in range(n):
    result += (X[i] - meanX) * (Y[i] - meanY)

result /= n * stdvX * stdvY
print("%.3f"%result)
