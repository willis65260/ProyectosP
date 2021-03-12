import random

partidas_ganadas=0

simulaciones = 10000

while simulaciones!=0:
    dado_1 = random.randrange(1, 6)
    dado_2 = random.randrange(1, 6)
    tirada = dado_1+dado_2


    if(tirada == 7 or tirada == 11 ):
        print(f"el gano salio un {tirada}")
    else:
        # or tirada == 5 or tirada == 6 or tirada == 8 or tirada == 9 or tirada == 10) # 
        if(tirada == 2 or tirada == 3 or tirada == 12):
            print(f"el perdio salio un {tirada}")
        if(tirada == 4 ):
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 4):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 4")
                    break
        if(tirada == 5):        
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 5):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 5")
                    break
        if(tirada == 6):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 6):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 6")
                    break
        if(tirada == 8):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 8):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 8")
                    break
        if(tirada == 9):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 9):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 9")
                    break
        if(tirada == 10):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 10):
                    print(f"el gano salieron dos {tirada}'s")
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    print(f"el perdio salio un {tirada} despues de un 10")
                    break
    simulaciones-=1

print(f"de 10000 simulaciones el sujeto gano {partidas_ganadas} veces")
print(f"la probabilidad de ganar es de {partidas_ganadas/10000*100} %")

simulaciones = 10
dinero=500

while simulaciones!=0:
    dado_1 = random.randrange(1, 6)
    dado_2 = random.randrange(1, 6)
    tirada = dado_1+dado_2


    if(tirada == 7 or tirada == 11 ):
        dinero+=50
        # print(f"el gano salio un {tirada}")
    else:
        # or tirada == 5 or tirada == 6 or tirada == 8 or tirada == 9 or tirada == 10) # 
        if(tirada == 2 or tirada == 3 or tirada == 12):
            # print(f"el perdio salio un {tirada}")
            dinero-=50
        if(tirada == 4 ):
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 4):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 4")
                    dinero-=50
                    break
        if(tirada == 5):        
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 5):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 5")
                    dinero-=50
                    break
        if(tirada == 6):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 6):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 6")
                    dinero-=50
                    break
        if(tirada == 8):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 8):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 8")
                    dinero-=50
                    break
        if(tirada == 9):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 9):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 9")
                    dinero-=50
                    break
        if(tirada == 10):            
            while 1>0:
                dado_1 = random.randrange(1, 6)
                dado_2 = random.randrange(1, 6)
                tirada = dado_1+dado_2
                if(tirada == 10):
                    # print(f"el gano salieron dos {tirada}'s")
                    dinero+=50
                    partidas_ganadas+=1
                    break
                if(tirada == 7):
                    # print(f"el perdio salio un {tirada} despues de un 10")
                    dinero-=50
                    break
    simulaciones-=1

print(f"Empezando con 500$ y perdiendo/ganando 50$ por juego, despues de 10 partidas el sujeto tiene {dinero} dinero")