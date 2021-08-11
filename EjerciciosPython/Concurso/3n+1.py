import matplotlib.pyplot as plt

value = []
ys = []
cont=0
for n in range(1,10000000,1):
    count = 1
    value.append(n)
    while n > 1:
        if n % 2 != 0:
            n = 3*n+1
        else:
            n = n/2
        count += 1

    ys.append(count)
    cont+=1


# ys.sort()

f = open("./ys_no_ordenadas.txt", "a")
for element in ys:
    f.write(str(element)+"\n")
f.close()

f = open("./array_ys_no_ordenadas.txt", "a")
f.write("[")
for element in ys:
    f.write(str(element)+",")
f.write("]")
f.close()

ys.sort()
f = open("./ys_ordenads.txt", "a")
for element in ys:
    f.write(str(element)+"\n")
f.close()

f = open("./array_ys_ordenadas.txt", "a")
f.write("[")
for element in ys:
    f.write(str(element)+",")
f.write("]")
f.close()

plt.plot(value, ys)

# naming the x axis
plt.xlabel('x - axis')
# naming the y axis
plt.ylabel('y - axis')

# giving a title to my graph
plt.title('My first graph!')

# function to show the plot
plt.show()
# 1  10
# 100  200
# 201  210
# 900  1000
