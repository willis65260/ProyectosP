import random

print("Inicio de ejercicio 1")

lanzamientos_moneda=0
dinero=0
caras_seguidas=0
sellos_seguidos=0
total_partidas=1000
partidas=total_partidas
sumatoria=0
promedio=0

mas_de_diez=0
menos_de_cinco=0

while partidas!=0:
    lanzamientos_moneda=0
    while lanzamientos_moneda<100:
        moneda = random.randint(1,2)
        if moneda == 1:
            sellos_seguidos+=1
            # print("salio sello")
            caras_seguidas = 0
            # dinero-=1

        if moneda == 2:
            caras_seguidas+=1
            # print("salio cara")
            sellos_seguidos = 0
            # dinero-=1

        lanzamientos_moneda+=1
        
        if caras_seguidas == 3 or sellos_seguidos == 3:

            sumatoria=sumatoria+lanzamientos_moneda

            print(f"{lanzamientos_moneda}")
            if(lanzamientos_moneda>10):
                mas_de_diez+=1

            if(lanzamientos_moneda<5):
                menos_de_cinco+=1

            break
        
        #final while
    partidas-=1

print(f"El promedio de tiradas para ganar un partida es de {sumatoria/total_partidas} tiradas")
print(f"Veces en ganar con mas de 10 tiradas {mas_de_diez} veces probabilidad {mas_de_diez/total_partidas*100}")
print(f"Veces en ganar con menos de 5 tiradas {menos_de_cinco} veces probabilidad {menos_de_cinco/total_partidas*100}")



lanzamientos_moneda=0
dinero=100
caras_seguidas=0
sellos_seguidos=0

partidas=1
sumatoria=0
promedio=0

gano_dinero=0

mas_de_diez=0
menos_de_cinco=0

while partidas!=0:
    lanzamientos_moneda=0
    while lanzamientos_moneda<100:
        moneda = random.randint(1,2)
        if moneda == 1:
            sellos_seguidos+=1
            # print("salio sello")
            caras_seguidas = 0
            # dinero-=1

        if moneda == 2:
            caras_seguidas+=1
            # print("salio cara")
            sellos_seguidos = 0
            # dinero-=1

        lanzamientos_moneda+=1
        dinero-=1
        if(dinero==0):
            break

        if caras_seguidas == 3 or sellos_seguidos == 3:

            sumatoria=sumatoria+lanzamientos_moneda
            # print(f"{lanzamientos_moneda}")


            gano_dinero+=1

            dinero += 8
            
            # break
        
        #final while
    partidas-=1

print(f"Despues de 100 tiradas y de empezar con 100 de dinero al final se quedo con {dinero} dinero")
print(f"Probabilidad de ganar dinero {gano_dinero} %? ")

lanzamientos_moneda=0
dinero=30
caras_seguidas=0
sellos_seguidos=0
partidas=1
sumatoria=0
promedio=0

gano_dinero=0

mas_de_diez=0
menos_de_cinco=0


while lanzamientos_moneda<10000:
    moneda = random.randint(1,2)
    if moneda == 1:
        sellos_seguidos+=1
        # print("salio sello")
        caras_seguidas = 0
        # dinero-=1

    if moneda == 2:
        caras_seguidas+=1
        # print("salio cara")
        sellos_seguidos = 0
        # dinero-=1

    lanzamientos_moneda+=1
    dinero-=1
    

    if caras_seguidas == 3 or sellos_seguidos == 3:

        sumatoria=sumatoria+lanzamientos_moneda
        # print(f"{lanzamientos_moneda}")

        
        gano_dinero+=1

        dinero += 8
        
        # break
    
    if(dinero==0):
        break
    #final while

print(f"Empezo con 30$ y el usuario jugo {lanzamientos_moneda} veces antes de quedarse sin dinero ")
print(f"Ademas el usuario gano un total de {gano_dinero} veces ")
# print(f"Sumatoria {lanzamientos_moneda} %? ")

lanzamientos_moneda=0
dinero=30
caras_seguidas=0
sellos_seguidos=0
partidas=100
sumatoria=0
promedio=0

gano_dinero=0

mas_de_diez=0
menos_de_cinco=0

mas_de_150=0

while partidas!=0:
    lanzamientos_moneda=0
    while lanzamientos_moneda<10000:
        moneda = random.randint(1,2)
        if moneda == 1:
            sellos_seguidos+=1
            caras_seguidas = 0

        if moneda == 2:
            caras_seguidas+=1
            sellos_seguidos = 0

        lanzamientos_moneda+=1
        
        if caras_seguidas == 3 or sellos_seguidos == 3:
            dinero += 8

        dinero-=1
        if(dinero==0):
            if(lanzamientos_moneda > 150):
                mas_de_150+=1
            sumatoria+=lanzamientos_moneda
            break

    partidas-=1

print(f"probabilidad de realizar >150 tiradas {mas_de_150} %")
print(f"se esperan alrededor de  {sumatoria/100}  lanzamientos antes de quedarse sin dinero")

print("Final")
