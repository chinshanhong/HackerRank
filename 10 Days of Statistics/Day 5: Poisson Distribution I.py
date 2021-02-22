import math
n = 2.5
k = 5
e = 2.71828
P = math.pow(n, k) * math.pow(e, -n) / math.factorial(k)
print("%.3f"%P)
