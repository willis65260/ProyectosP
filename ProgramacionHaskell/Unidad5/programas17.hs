
--Ejercicio 7.1
repite :: a -> [a]
repite x = x : repite x

repiteC :: a -> [a]
repiteC x = [x | _ <- [1..]]

repiteFinita :: Int -> a -> [a]
repiteFinita 0 x = []
repiteFinita n x = x : repiteFinita (n-1) x

repiteFinitaC :: Int -> a -> [a]
repiteFinitaC n x = [x | _ <- [1..n]]

repiteFinita' :: Int -> a -> [a]
repiteFinita' n x = take n (repite x)

--Ejercicio 7.2
ecoC :: [a] -> [a]
ecoC xs = concat [replicate i x | (i,x) <- zip [1..] xs]

ecoR :: [a] -> [a]
ecoR xs = aux 1 xs where aux n [] = []
aux n (x:xs) = replicate n x ++ aux (n+1) xs

--Ejercicio 7.3
potenciasMenores :: Int -> Int -> [Int]
potenciasMenores x y = takeWhile (<y) (map (x^) [1..])

--Ejercicio 7.4
multiplosRestringidos :: Int -> (Int -> Bool) -> [Int]
multiplosRestringidos n p = [y | y <- [n,2*n..], all p (digitos y)]

digitos :: Int -> [Int]
digitos n = [read [x] | x <- show n]

--Ejercicio 7.5
itera :: (a -> a) -> a -> [a]
itera f x = x : itera f (f x)

--Ejercicio 7.6
agrupa :: Int -> [a] -> [[a]]
agrupa n [] = []
agrupa n xs = take n xs : agrupa n (drop n xs)

agrupa' :: Int -> [a] -> [[a]]
agrupa' n = takeWhile (not . null).map(take n).iterate(drop n)

-- prop_AgrupaLongitud :: Int -> [Int] -> Property
-- prop_AgrupaLongitud n xs = n > 0 && not (null gs) ==> and [length g == n | g <- init gs] && 0 < length (last gs) && length (last gs) <= n where gs = agrupa n xs

-- prop_AgrupaCombina :: Int -> [Int] -> Property
-- prop_AgrupaCombina n xs = n > 0 ==> concat (agrupa n xs) == xs

--Ejercicio 7.7
siguiente n | even n = n `div` 2 | otherwise = 3*n+1

collatz :: Integer -> [Integer]
collatz 1 = [1]
collatz n = n : collatz (siguiente n)

collatz' :: Integer -> [Integer]
collatz' n = (takeWhile (/=1) (iterate siguiente n)) ++ [1]

menorCollatzMayor :: Int -> Integer
menorCollatzMayor x = head [y | y <- [1..], length (collatz y) > x]

menorCollatzSupera :: Integer -> Integer
menorCollatzSupera x = head [y | y <- [1..], maximum (collatz y) > x]

menorCollatzSupera' :: Integer -> Integer
menorCollatzSupera' x = head [n | n <- [1..], t <- collatz' n, t > x]

--Ejercicio 7.8
primos :: Integral a => [a]
primos = criba [2..] where criba [] = []
criba (n:ns) = n : criba (elimina n ns)
elimina n xs = [x | x <- xs, x `mod` n /= 0]

primo :: Integral a => a -> Bool
primo x = x == head (dropWhile (<x) primos)

--Ejercicio 7.9
sumaDeDosPrimos :: Int -> [(Int,Int)]
sumaDeDosPrimos n = [(x,n-x) | x <- primosN, x < n-x, elem (n-x) primosN] where primosN = takeWhile (<=n) primos

--Ejercicio 7.10
esProductoDeDosPrimos :: Int -> Bool
esProductoDeDosPrimos n = [x | x <- primosN, mod n x == 0, div n x /= x, elem (div n x) primosN] /= [] where primosN = takeWhile (<=n) primos

--Ejercicio 7.11
esMuyCompuesto :: Int -> Bool
esMuyCompuesto x = and [numeroDivisores y < n | y <- [1..x-1]] where n = numeroDivisores x

numeroDivisores :: Int -> Int
numeroDivisores = length . divisores

divisores :: Int -> [Int]
divisores x = [y | y <- [1..x], mod x y == 0]

muyCompuesto :: Int -> Int
muyCompuesto n = [x | x <- [1..], esMuyCompuesto x] !! n

--Ejercicio 7.12
primoTruncable :: Int -> Bool
primoTruncable x | x < 10 = primo x | otherwise = primo x && primoTruncable (x `div` 10)

--Ejercicio 7.13

intercala :: a -> [a] -> [[a]]
intercala x [] = [[x]]
intercala x (y:ys) = (x:y:ys) : [y:zs | zs <- intercala x ys]

permutaciones :: [a] -> [[a]]
permutaciones [] = [[]]
permutaciones (x:xs) = concat [intercala x ys | ys <- permutaciones xs]

primoPermutable :: Int -> Bool
primoPermutable x = and [primo y | y <- permutacionesN x]

permutacionesN :: Int -> [Int]
permutacionesN x = [read ys | ys <- permutaciones (show x)]

--Ejercicio 7.14
enteros :: [Int]
enteros = 0 : concat [[-x,x] | x <- [1..]]

enteros' :: [Int]
enteros' = iterate siguiente 0 where siguiente x | x >= 0 = -x-1 | otherwise = -x

posicion :: Int -> Int
posicion x = length (takeWhile (/=x) enteros)

posicion1 :: Int -> Int
posicion1 x = aux enteros 0 where aux (y:ys) n | x == y = n | otherwise = aux ys (n+1)

posicion2 :: Int -> Int
posicion2 x = head [n | (n,y) <- zip [0..] enteros, y == x]

posicion3 :: Int -> Int
posicion3 x | x >= 0 = 2*x | otherwise = 2*(-x)-1

--Ejercicio 7.15
divisoresEn :: Int -> [Int] -> Bool
divisoresEn 1 _ = True
divisoresEn x [] = False
divisoresEn x (y:ys) | mod x y == 0 = divisoresEn (div x y) (y:ys) | otherwise = divisoresEn x ys

mezcla2 :: [Int] -> [Int] -> [Int]
mezcla2 p@(x:xs) q@(y:ys) | x < y = x:mezcla2 xs q | x > y = y:mezcla2 p ys | otherwise = x:mezcla2 xs ys
mezcla2 [] ys = ys
mezcla2 xs [] = xs

mezcla3 :: [Int] -> [Int] -> [Int] -> [Int]
mezcla3 xs ys zs = mezcla2 xs (mezcla2 ys zs)

hamming :: [Int]
hamming = 1 : mezcla3 [2*i | i <- hamming] [3*i | i <- hamming] [5*i | i <- hamming]

hamming' :: [Int]
hamming' = [x | x <- [1..], divisoresEn x [2,3,5]]

cantidadHammingMenores :: Int -> Int
cantidadHammingMenores x = length (takeWhile (<x) hamming')

siguienteHamming :: Int -> Int
siguienteHamming x = head (dropWhile (<=x) hamming')

huecoHamming :: Int -> [(Int,Int)]
huecoHamming n = [(x,y) | x <- hamming', let y = siguienteHamming x, y-x > n]

prop_Hamming :: Int -> Bool
prop_Hamming n = huecoHamming n' /= [] where n' = abs n
--Ejercicio 7.16
sumaPrimoMenores :: Int -> Int
sumaPrimoMenores n = sumaMenores n primos 0 where sumaMenores n (x:xs) a | n <= x = a | otherwise = sumaMenores n xs (a+x)

--Ejercicio 7.17
triangulares :: [Integer]
triangulares = 1:[x+y | (x,y) <- zip [2..] triangulares]

triangulares' :: [Integer]
triangulares' = scanl (+) 1 [2..]

divisores1 :: Integer -> [Integer]
divisores1 x = [y | y <- [1..x], mod x y == 0]

nDivisores :: Integer -> Int
nDivisores x = length (divisores1 x)

euler12 :: Int -> Integer
euler12 n = head [x | x <- triangulares, nDivisores x > n]


--Ejercicio 7.18
digitosC :: Integer -> [Integer]
digitosC n = [read [x] | x <- show n]

media :: [Integer] -> Float
media xs = (fromIntegral (sum xs)) / (fromIntegral (length xs))

relacionados :: (a -> a -> Bool) -> [a] -> Bool
relacionados r (x:y:zs) = (r x y) && relacionados r (y:zs)
relacionados _ _ = True

equivalentes :: Integer -> Integer -> Bool
equivalentes x y = media (digitosC x) == media (digitosC y)

primosEquivalentes :: Int -> [[Integer]]
primosEquivalentes n = aux primos where aux (x:xs) | relacionados equivalentes ys = ys : aux xs | otherwise = aux xs where ys = take n (x:xs)

--Ejercicio 7.19
paresOrdenados :: [a] -> [(a,a)]
paresOrdenados [] = []
paresOrdenados (x:xs) = [(x,y) | y <- xs] ++ paresOrdenados xs

paresOrdenados2 :: [a] -> [(a,a)]
paresOrdenados2 [] = []
paresOrdenados2 (x:xs) = foldr (\y ac -> (x,y):ac) (paresOrdenados2 xs) xs

paresOrdenados3 :: [a] -> [(a,a)]
paresOrdenados3 [] = []
paresOrdenados3 (x:xs) = zip (repeat x) xs ++ paresOrdenados3 xs

--Ejercicio 7.21
potenciaFunc :: Int -> (a -> a) -> a -> a
potenciaFunc 0 _ x = x
potenciaFunc n f x = potenciaFunc (n-1) f (f x)

potenciaFunc2 :: Int -> (a -> a) -> a -> a
potenciaFunc2 n f x = last (take (n+1) (iterate f x))

--Ejercicio 7.22
sumaDeDos :: Int -> [Int] -> Maybe (Int,Int)
sumaDeDos _ [] = Nothing
sumaDeDos _ [_] = Nothing
sumaDeDos y (x:xs) | y-x `elem` xs = Just (x,y-x) | otherwise = sumaDeDos y xs

sumaDeDos' :: Int -> [Int] -> Maybe (Int,Int)
sumaDeDos' x xs | null ys = Nothing | otherwise = Just (head ys) where ys = [(a,b) | (a,b) <- paresOrdenados xs , a+b == x]

--Ejercicio 7.23
eslabones :: Int -> Int -> Int -> [Int]
eslabones i d n = [(i+d*j) `mod` n | j <- [0..]]

eslabones2 :: Int -> Int -> Int -> [Int]
eslabones2 i d n = map (\x-> mod x n) (iterate (+d) i)

numeroVueltas :: Int -> Int -> Int -> Int
numeroVueltas i d n = length (takeWhile (/=0) (eslabones i d n))

--Ejercicio 7.24
golomb :: Int -> Int
golomb n = sucGolomb !! (n-1)

sucGolomb :: [Int]
sucGolomb = subSucGolomb 1

subSucGolomb :: Int -> [Int]
subSucGolomb 1 = [1] ++ subSucGolomb 2
subSucGolomb 2 = [2,2] ++ subSucGolomb 3
subSucGolomb x = (replicate (golomb x) x) ++ subSucGolomb (x+1)

sucGolomb' :: [Int]
sucGolomb' = 1 : 2 : 2 : g 3 where g x = replicate (golomb x) x ++ g (x+1)