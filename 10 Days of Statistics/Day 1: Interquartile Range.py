n = int(input())
data = [int(x) for x in input().strip().split()]
frequentcy = [int(f) for f in input().strip().split()]
dataSet = lowerHalf =  upperHalf = []
Q1 = Q3 = IQR = 0

for i in range(n):
    for j in range(frequentcy[i]):
        dataSet.append(data[i])
dataSet.sort()

if len(dataSet) % 2 == 0:
    lowerHalf = dataSet[0 : (len(dataSet) // 2)]
    upperHalf = dataSet[(len(dataSet) // 2) : ]
else:
    lowerHalf = dataSet[0 : (len(dataSet)) // 2]
    upperHalf = dataSet[(len(dataSet) // 2) + 1 : ]
    
if len(lowerHalf) % 2 == 0:
    Q1 = (lowerHalf[(len(lowerHalf) // 2)] + lowerHalf[(len(lowerHalf) // 2 - 1)]) // 2
else:
    Q1 = lowerHalf[(len(lowerHalf) // 2)]

if len(upperHalf) % 2 == 0:
    Q3 =  (upperHalf[(len(upperHalf) // 2)] + upperHalf[(len(upperHalf) // 2 - 1)]) // 2
else:
    Q3 = upperHalf[(len(upperHalf) // 2)]
    
IQR = Q3 - Q1
print("%.1f"%(IQR))
