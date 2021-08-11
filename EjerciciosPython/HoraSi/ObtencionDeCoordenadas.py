value = []
ys = []
x_axis=[]

f = open("./coordenadas.txt", "r")
contenido_f = f.readlines()
for line in contenido_f:
    ys.append(line)
f.close()

print(len(ys))
f = open("./coordenadas_figura.txt", "a")
for element in ys:
    vector_temporal = element.split()
    f.write(vector_temporal[0])
    f.write(" ")
    f.write(vector_temporal[1])
    f.write(" ")
    f.write(vector_temporal[2])
    f.write("\n")
f.close()