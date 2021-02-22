import math
mean = 70
stdv = 10
a = 80
b = 60
result1 = (1 - 0.5 * (1 + math.erf((a - mean) / (stdv * (2 ** 0.5))))) * 100
result2 = (1 - 0.5 * (1 + math.erf((b - mean) / (stdv * (2 ** 0.5))))) * 100
result3 = 0.5 * (1 + math.erf((b - mean) / (stdv * (2 ** 0.5)))) * 100
print("%.2f"%result1)
print("%.2f"%result2)
print("%.2f"%result3)
