import Data.List
--Ejercicio 3.1
potencia :: Integer -> Integer -> Integer
potencia m 0 = 1
potencia m n = m*(potencia m (n-1))

--Ejercicio 3.2
replicate' :: Int -> a -> [a]
replicate' n x = [x | _ <- [1..n]]

--Ejercicio 3.3
dobleFactorial :: Integer -> Integer
dobleFactorial 0 = 1
dobleFactorial 1 = 1
dobleFactorial n = n * dobleFactorial (n-2)

--Ejercicio 3.4
mcd :: Integer -> Integer -> Integer
mcd a 0 = a
mcd a b = mcd b (a `mod` b)

--Ejercicio 3.5
menorDivisible :: Integer -> Integer -> Integer
menorDivisible a b
    | a == b = a
    | otherwise = lcm a (menorDivisible (a+1) b)

euler5 :: Integer
euler5 = menorDivisible 1 20

--Ejercicio 3.6
numPasosHanoi :: Integer -> Integer
numPasosHanoi 1     = 1
numPasosHanoi n = 1 + 2 * numPasosHanoi n

--Ejercicio 3.7
and' :: [Bool] -> Bool
and' []     = True
and' (b:bs) = b && and' bs

--Ejercicio 3.8
elem' :: Eq a => a -> [a] -> Bool
elem' x [] = False
elem' x (y:ys) | x == y = True
               | otherwise = elem' x ys

--Ejercicio 3.9
last' :: [a] -> a
last' [x] = x
last' (_:xs) = last' xs

--Ejercicio 3.10
concat' :: [[a]] -> [a]
concat' [] = []
concat' (xs:xss) = xs ++ concat' xss

--Ejercicio 3.11
selecciona :: [a] -> Int -> a
selecciona (x:_) 0 = x
selecciona (_:xs) n = selecciona xs (n-1)

--Ejercicio 3.12
take' :: Int -> [a] -> [a]
take' 0 _ = []
take' _ [] = []
take' n (x:xs) = x : take' (n-1) xs

--Ejercicio 3.13
refinada :: [Float] -> [Float]
refinada (x:y:zs) = x : (x+y)/2 : refinada (y:zs)
refinada xs = xs

--Ejercicio 3.14
mezcla :: Ord a => [a] -> [a] -> [a]
mezcla [] ys = ys
mezcla xs [] = xs
mezcla (x:xs) (y:ys) | x <= y = x : mezcla xs (y:ys)
                     | otherwise = y : mezcla (x:xs) ys


mitades :: [a] -> ([a],[a])
mitades xs = splitAt (length xs `div` 2) xs



ordMezcla :: Ord a => [a] -> [a]
ordMezcla [] = []
ordMezcla [x] = [x]
ordMezcla xs = mezcla (ordMezcla ys) (ordMezcla zs)
                where (ys,zs) = mitades xs


ordenada :: Ord a => [a] -> Bool
ordenada [] = True
ordenada [_] = True
ordenada (x:y:xs) = x <= y && ordenada (y:xs)


prop_ordMezcla_ordenada :: Ord a => [a] -> Bool
prop_ordMezcla_ordenada xs = ordenada (ordMezcla xs)


borra :: Eq a => a -> [a] -> [a]
borra x [] = []
borra x (y:ys) | x == y = ys
               | otherwise = y : borra x ys


esPermutacion :: Eq a => [a] -> [a] -> Bool
esPermutacion [] [] = True
esPermutacion [] (y:ys) = False
esPermutacion (x:xs) ys = elem x ys && esPermutacion xs (borra x ys)


prop_ordMezcla_pemutacion :: Ord a => [a] -> Bool
prop_ordMezcla_pemutacion xs = esPermutacion (ordMezcla xs) xs


--Ejercicio 4.1
sumaCuadradosR :: Integer -> Integer
sumaCuadradosR 0 = 0
sumaCuadradosR n = n^2 + sumaCuadradosR (n-1)
sumaCuadradosC :: Integer -> Integer
sumaCuadradosC n = sum [x^2 | x <- [1..n]]

--Ejercicio 4.2
numeroBloquesR :: Integer -> Integer
numeroBloquesR 0 = 0
numeroBloquesR n = 2*n + numeroBloquesR (n-1)
numeroBloquesC :: Integer -> Integer
numeroBloquesC n = sum [2*x | x <- [1..n]]

--Ejercicio 4.3
sumaCuadradosImparesR :: Integer -> Integer
sumaCuadradosImparesR 1 = 1
sumaCuadradosImparesR n 
    |odd n = n^2 + sumaCuadradosImparesR (n-1)
    | otherwise = sumaCuadradosImparesR (n-1)
sumaCuadradosImparesC2 :: Integer -> Integer
sumaCuadradosImparesC2 n = sum [x^2 | x<- [1..n], odd x]
sumaCuadradosImparesC2' :: Integer -> Integer
sumaCuadradosImparesC2' n = sum[x^2 | x<-[1,3..n]]

--Ejercicio 4.4
digitosR :: Integer -> [Integer]
digitosR n = reverse (digitosR' n)
digitosR' n
    | n < 10 = [n]
    | otherwise = (n `rem` 10) : digitosR' (n `div` 10)
digitosC :: Integer -> [Integer]
digitosC n = [read [x] | x <- show n]
sumaDigitosR :: Integer -> Integer
sumaDigitosR n 
    | n < 10    = n
    | otherwise = n `rem` 10 + sumaDigitosR (n `div` 10)
sumaDigitosNR :: Integer -> Integer
sumaDigitosNR n = sum (digitosR n)
esDigito :: Integer -> Integer -> Bool
esDigito x n = elem x (digitosR n)
numeroDeDigitos :: Integer -> Int
numeroDeDigitos x = length (digitosR x)
listaNumeroR :: [Integer] -> Integer
listaNumeroR xs = listaNumeroR' (reverse xs)
listaNumeroR' :: [Integer] -> Integer
listaNumeroR' [x] = x
listaNumeroR' (x:xs) = x + 10 * (listaNumeroR' xs)
listaNumeroC :: [Integer] -> Integer
listaNumeroC xs = sum [y*10^n | (y,n) <- zip (reverse xs) [0..]]
pegaNumerosR :: Integer -> Integer -> Integer
pegaNumerosR x y 
    | y < 10 = 10*x+y
    | otherwise = 10 *pegaNumerosR x (y `div` 10) + (y `rem` 10)
pegaNumerosNR :: Integer -> Integer -> Integer
pegaNumerosNR x y = listaNumeroC (digitosR x ++ digitosR y)
primerDigitoR :: Integer -> Integer
primerDigitoR n 
    | n < 10 = n
    | otherwise = primerDigitoR (n `div` 10)
primerDigitoNR :: Integer -> Integer
primerDigitoNR n = head (digitosR n)
ultimoDigito :: Integer -> Integer
ultimoDigito n = n `rem` 10
inverso :: Integer -> Integer
inverso n = listaNumeroC (reverse(digitosR n))
inverso' :: Integer -> Integer
inverso' n = read (reverse(show n))
capicua :: Integer -> Bool 
capicua n = n == inverso n
euler16 :: Integer -> Integer
euler16 n = sumaDigitosNR (2^n)
primitivo :: Integer -> Integer
primitivo n | n < 10 = n
            | otherwise = primitivo (producto n)
producto :: Integer -> Integer
producto = product . digitosC
equivalentes :: Integer -> Integer -> Bool
equivalentes x y = media (digitosC x) == media (digitosC y)
media :: [Integer] -> Float
media xs = (fromIntegral (sum xs)) / (fromIntegral (length xs)) 

--Ejercicio 4.5
cuadradosC :: [Integer] -> [Integer]
cuadradosC xs = [x*x | x <- xs]
cuadradosR :: [Integer] -> [Integer]
cuadradosR [] = []
cuadradosR (x:xs) = x*x : cuadradosR xs

--Ejercicio 4.6
imparesC :: [Integer] -> [Integer]
imparesC xs = [x | x <- xs, odd x]
imparesR :: [Integer] -> [Integer]
imparesR [] = []
imparesR (x:xs) | odd x = x : imparesR xs
                | otherwise = imparesR xs 

--Ejercicio 4.7
imparesCuadradosC :: [Integer] -> [Integer]
imparesCuadradosC xs = [x*x | x <- xs, odd x]
imparesCuadradosR :: [Integer] -> [Integer]
imparesCuadradosR [] = []
imparesCuadradosR (x:xs) | odd x =x*x : imparesCuadradosR xs
                         | otherwise = imparesCuadradosR xs

--Ejercicio 4.8
sumaCuadradosImparesC :: [Integer] -> Integer
sumaCuadradosImparesC xs = sum [x*x | x <- xs,odd x]
sumaCuadradosImparesR2 :: [Integer] -> Integer
sumaCuadradosImparesR2 [] = 0
sumaCuadradosImparesR2 (x:xs)
    | odd x     = x*x + sumaCuadradosImparesR2 xs
    | otherwise = sumaCuadradosImparesR2 xs

--Ejercicio 4.9
entreL :: Integer -> Integer -> [Integer]
entreL m n = [m..n]
entreR :: Integer -> Integer -> [Integer]
entreR m n | m > n = []
           | otherwise = m : entreR (m+1) n

--Ejercicio 4.10
mitadParesC :: [Int] -> [Int]
mitadParesC xs = [x `div` 2 | x <- xs, x `mod` 2 ==0]
mitadParesR :: [Int] -> [Int]
mitadParesR [] = []
mitadParesR (x:xs)
    | even x = x `div` 2 : mitadParesR xs
    | otherwise = mitadParesR xs

--Ejercicio 4.11
enRangoC :: Int -> Int -> [Int] -> [Int]
enRangoC a b xs = [x | x <- xs, a <= x, x <=b]
enRangoR :: Int -> Int -> [Int] -> [Int]
enRangoR a b [] = []
enRangoR a b (x:xs)
    | a <= x && x <= b = x : enRangoR a b xs
    | otherwise        = enRangoR a b xs 

--Ejercicio 4.12
sumaPositivosC :: [Int] -> Int
sumaPositivosC xs = sum [x | x <- xs, x > 0]
sumaPositivosR :: [Int] -> Int 
sumaPositivosR [] = 0
sumaPositivosR (x:xs) | x>0       = x + sumaPositivosR xs 
                      | otherwise = sumaPositivosR xs

--Ejercicio 4.13
aproximaPiC n = sqrt(6*sum [1/x^2 | x <- [1..n]])
aproximaPiR n = sqrt(6*aproximaPiR' n)
aproximaPiR' 1 = 1
aproximaPiR' n = 1/n^2 + aproximaPiR' (n-1)

--Ejercicio 4.14
sustituyeImpar :: [Int] -> [Int]
sustituyeImpar [] = []
sustituyeImpar (x:xs) | odd x     = (x+1): sustituyeImpar xs
                      | otherwise = x:sustituyeImpar xs

--Ejercicio 4.15
agarradoC :: [Float] -> Float
agarradoC ps = sum [p * 0.9 | p <- ps, p * 0.9 <= 199]
agarradoR :: [Float] -> Float
agarradoR [] = 0
agarradoR (p:ps)
    | precioConDescuento <= 199 = precioConDescuento + agarradoR ps
    | otherwise                 = agarradoR ps
    where precioConDescuento = p * 0.9
prop_agarrado :: [Float] -> Bool
prop_agarrado xs = abs (agarradoR xs - agarradoC xs) <= 0.1

--Ejercicio 4.16
factores :: Integer -> [Integer]
factores n = [x | x <- [1..n], mod n x == 0]
primo :: Integer -> Bool
primo x = factores x == [1,x]
factoresPrimos :: Integer -> [Integer]
factoresPrimos n = [x | x <- factores n, primo x]
mayorExponenteR :: Integer -> Integer -> Integer 
mayorExponenteR a b 
    | mod b a /=0 = 0
    | otherwise   = 1 + mayorExponenteR a (b `div` a)
mayorExponenteC :: Integer -> Integer -> Integer
mayorExponenteC a b = head [x-1 | x <- [0..], mod b (a^x) /= 0]
factorizacion1 :: Integer -> [(Integer,Integer)]
factorizacion1 n = [(x,mayorExponenteR x n) | x <- factoresPrimos n]
expansionR :: [(Integer,Integer)] -> Integer
expansionR [] = 1
expansionR ((x,y):zs) = x^y * expansionR zs
expansionC :: [(Integer,Integer)] -> Integer
expansionC xs = product [x^y | (x,y) <- xs]
prop_factorizacion1 n = and [expansionC (factorizacion1 x) == x | x <- [1..n]]

--Ejercicio 4.17


digitosDeFactorizacion :: Integer -> [Integer]
digitosDeFactorizacion n = sort(nub(concat [digitos x | x <- numerosDeFactorizacion n]))
digitos :: Integer -> [Integer]
digitos n = [read [x] | x <- show n]
numerosDeFactorizacion :: Integer -> [Integer]
numerosDeFactorizacion n =sort (nub (aux (factorizacion n)))
                           where aux [] = []
                                 aux ((x,y): zs) = x : y : aux zs
factorizacion :: Integer -> [(Integer,Integer)]
factorizacion n = [(head xs, fromIntegral (length xs)) | xs <- group (factorizacion' n)]
factorizacion' :: Integer -> [Integer]
factorizacion' n | n == 1    = []
                 | otherwise = x : factorizacion' (div n x)
                 where x = menorFactor n 
menorFactor :: Integer -> Integer
menorFactor n = head [x | x <- [2..], rem n x == 0]
factorial :: Integer -> Integer
factorial n = product [1..n]
solucion = head [n | n <- [1..], digitosDeFactorizacion (factorial n) == [0..9]]

--Ejercicio 4.18
especial :: Integer -> Bool
especial x = and [esPrimo (d + x `div` d) | d <- divisores x]
divisores :: Integer -> [Integer]
divisores x = [d | d <- [1..x], x `rem` d==0]
esPrimo :: Integer -> Bool
esPrimo x = divisores x == [1,x]
sumaEspeciales :: Integer -> Integer
sumaEspeciales n = sum [x | x <- [1..n], especial x]
sumaEspecialesR :: Integer -> Integer
sumaEspecialesR 0 = 0
sumaEspecialesR n | especial n = n + sumaEspecialesR (n-1)
                  | otherwise = sumaEspecialesR (n-1)

--Ejercicio 4.19
distanciaC :: Eq a => [a] -> [a] -> Int
distanciaC xs ys = length [(x,y) | (x,y) <- zip xs ys, x /= y]
distanciaR :: Eq a => [a] -> [a] -> Int
distanciaR [] ys = 0
distanciaR xs [] = 0
distanciaR (x:xs)(y:ys) | x /= y = 1 + distanciaR xs ys
                        | otherwise = distanciaR xs ys

--Ejercicio 4.20
traspuesta :: [[a]] -> [[a]]
traspuesta [] = []
traspuesta ([]:xss) = traspuesta xss
traspuesta ((x:xs):xss) = (x:[h | (h:_) <- xss]) : traspuesta (xs : [t | (_:t) <- xss])

--Ejercicio 4.21
sumas :: Int -> [Int] -> [Int]
sumas 0 _ = [0]
sumas _ [] = [0]
sumas n (x:xs) = [x+y | y <- sumas (n-1) (x:xs)]++ sumas n xs


