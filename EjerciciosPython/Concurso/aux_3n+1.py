import matplotlib.pyplot as plt

value = []
ys = []
x_axis=[]

f = open("./array_ys_ordenadas.txt", "r")
contenido_f = f.readlines()
for line in contenido_f:
    ys.append(int(line))
f.close()


# f = open("./valores_repetidos.txt", "a")
# f.write("[")
# for i in range(1,700,1):
#     f.write(str(ys.count(i))+",")
# f.write("]")
# f.close()

cont=1
for i in range(1,700,1):
    value.append(ys.count(i))
    x_axis.append(i)


plt.plot(x_axis, value)

# naming the x axis
plt.xlabel('x - axis')
# naming the y axis
plt.ylabel('y - axis')

# giving a title to my graph
plt.title('My first graph!')

# function to show the plot
plt.show()