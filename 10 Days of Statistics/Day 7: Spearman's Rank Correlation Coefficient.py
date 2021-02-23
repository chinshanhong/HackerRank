n = int(input())
X = [float(x) for x in input().strip().split()]
Y = [float(y) for y in input().strip().split()]
di = 0;

cloneX = X.copy()
cloneY = Y.copy()
cloneX.sort()
cloneY.sort()

for i in range(n):
    di += ((cloneX.index(X[i]) + 1) - (cloneY.index(Y[i]) + 1)) **2

#calculate the result using pearman's rank correlation coefficient formula
result = 1 - ((6 * di) / (n * (n ** 2 -1)))
print("%.3f"%result)
