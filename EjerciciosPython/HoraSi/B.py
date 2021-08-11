while True:
    try:
        x=input()
        k=int(input())
        cadenas=[]
        Diferencias=[]
        indice=0
        for i in range(k):
            n=""
            while len(n) == 0 or len(n) > 100000:
                n=input()
                if len(n) < 100000:
                    cadenas.append(n)
        for c in cadenas:
            dif=0
            indice+=1
            for j in range (len(x)):
                if not x[j] == c[j]:
                    dif+=1
            Diferencias.append([dif,indice]) 
        Diferencias.sort()
        print(Diferencias[0][1])
        print(Diferencias[1][1])
    except EOFError:
        break
# cbufllatkz

# 5

# cbofllafkz

# cbhflluteq

# cbuzqzatmz

# msrzlxaekz

# xbufpltpkl