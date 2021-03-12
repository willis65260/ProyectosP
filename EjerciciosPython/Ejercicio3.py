import random
import numpy as np

cantidad_triangulos_agudos=0
total_veces=10000
veces=total_veces

while(veces!=0):
    t1=2*np.pi*random.uniform(0,1)
    r1=.5*np.sqrt(random.uniform(0,1))
    x1=0+r1*np.cos(t1)
    y1=0+r1*np.sin(t1)


    t2=2*np.pi*random.uniform(0,1)
    r2=.5*np.sqrt(random.uniform(0,1))
    x2=0+r2*np.cos(t2)
    y2=0+r2*np.sin(t2)


    t3=2*np.pi*random.uniform(0,1)
    r3=.5*np.sqrt(random.uniform(0,1))
    x3=0+r3*np.cos(t3)
    y3=0+r3*np.sin(t3)


    # print(f"t={t1} r={r1} x={x1} y={y1}")
    # print(f"t={t2} r={r2} x={x2} y={y2}")
    # print(f"t={t3} r={r3} x={x3} y={y3}")


    # 1 con 2
    a=np.sqrt((x1-x2)**2+(y1-y2)**2)


    # 2 con 3
    b=np.sqrt((x2-x3)**2+(y2-y3)**2)


    # 3 con 1
    c=np.sqrt((x3-x1)**2+(y3-y1)**2)
    # print(f"Angulo A={a}  Angulo B={b}  Angulo C={c}")


    A=((np.arccos((b**2+c**2-a**2)/2*b*c))*180)/np.pi
    B=((np.arccos((a**2+c**2-b**2)/2*a*c))*180)/np.pi
    C=180-A-B

    Angulos=A+B+C

    if(A<90 and B<90 and C<90):
        # print("yey")
        cantidad_triangulos_agudos+=1

    # print("")
    # print(f"Angulo A={A}  Angulo B={B}  Angulo C={C}")
    veces-=1

print(f"La cantidad de triangulos agudos es de {cantidad_triangulos_agudos}")
print(f"La probabilidad de que se genere un triangulo agudo es de  {cantidad_triangulos_agudos*100/total_veces}")


