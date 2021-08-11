--Ejercicio 1
media3 x y z = (x+y+z)/2

--Ejercicio 2
sumaMonedas a b c d e = 1*a+2*b+5*c+10*d+20*e

--Ejercicio 3
volumenEsfera r = (4/3)*pi*r^3

--Ejercicio 4
area r1 r2 = pi*(r2^2 -r1^2)

--Ejercicio 5
ultimaCifra x = rem x 10

--Ejercicio 6
maxTres x y z = max x (max y z)

--Ejercicio 7
tabla x y
    | x == 'T' && y == 'T' = 'T'
    | x == 'T' && y == 'F' = 'T'
    | x == 'F' && y == 'T' = 'T'
    | x == 'F' && y == 'F' = 'F'

xor2 True y = not y
xor2 False y = y

xor3 x y = (x || y) && not (x && y)

xor4 x y = x /= y

--Ejercicio 8
rota1 xs = tail xs ++ [head xs]
rota n xs = drop n xs ++ take n xs

--Ejercicio 9
rango xs = [minimum xs, maximum xs]

--Ejercicio 10
palin x = x == reverse x

--Ejercicio 11
interior x = tail (init x)

--Ejercicio 12
finalLista n x = drop (length x - n) x

--Ejercicio 13
segmento m n x = drop (m-1) (take n x)

--Ejercicio 14
extremos n x = take n x ++ drop (length x - n) x

--Ejercicio 15
mediano x y z = x + y + z- minimum [x,y,z] - maximum [x,y,z]
mediano1 x y z
    | a <= x && x <= b = x
    | a <= y && y <= b = y
    | otherwise        = z
    where a = minimum [x,y,z]
          b = maximum [x,y,z]

--Ejercicio 16
tresIguales x y z = x == y && y == z
tresDiferentes x y z = x /= y && x /= z && y /= z

--Ejercicio 17
cuatroIguales x y z u = x == y && tresIguales y z u

--Ejercicio 18
triangular a b c = a < b+c && b < a+c && c < a+b

--Ejercicio 19
divisionSegura _ 0 = 9999
divisionSegura x y = x/y

--Ejercicio 20
--disyuncion  

--Ejercicio 21
modulo (x,y) = sqrt(x^2+y^2)

--Ejercicio 22
mayorRectangulo (a,b) (c,d) | a*b >= c*d = (a,b)
                            | otherwise = (c,d)

--Ejercicio 23
cuadrante (x,y)
    | x > 0 && y > 0 = 1
    | x < 0 && y > 0 = 2
    | x < 0 && y < 0 = 3
    | x > 0 && y < 0 = 4

intercambia (x,y) = (y,x)

simetricoH (x,y) = (x,-y)

distancia (x1,y1) (x2,y2) = sqrt((x1-x2)^2+(y1-y2)^2)

pMedio (x1,y1) (x2,y2) = ((x1+x2)/2, (y1+y2)/2)

--Ejercicio 24
suma (a,b) (c,d) = (a+c, b+d)
producto (a,b) (c,d) = (a*c-b*d, a*d+b*c)
conjugado (a,b) = (a,-b)

--Ejercicio 25
intercala [x1,x2] [y1,y2] = [x1,y1,x2,y2]

--Ejercicio 26
ciclo [] = [] 
ciclo x = last x : init x

--Ejercicio 27
numeroMayor x y = a*10 + b
    where a = max x y
          b = min x y

--Ejercicio 28
numeroDeRaices a b c 
    | d < 0     = 0
    | d == 0    = 1
    | otherwise = -2
    where d = b^2-4*a*c

--Ejercicio 29
raices_1 a b  c = [(-b+d)/t,(-b-d)/t]
    where d = sqrt (b^2 - 4*a*c)
          t = 2*a
raices_2 a b c 
    | d >= 0 = [(-b+e)/(2*a), (-b-e)/(2*a)]
    | otherwise = error "No tiene raices reales"
    where d = b^2-4*a*c
          e = sqrt d 

--Ejercicio 30
area2 a b c = sqrt (s*(s-a)*(s-b)*(s-c))
    where s = (a+b+c)/2

--Ejercicio 31
formaReducida (a,b) = (a `div`  c, b `div`  c)
    where c = gcd a b
suma2 (a,b) (c,d) = formaReducida (a*d+b*c, b*d)
producto2 (a,b) (c,d) = formaReducida (a*c, b*d)
igualdad (a,b) (c,d) = 
    formaReducida (a,b) == formaReducida (c,d)