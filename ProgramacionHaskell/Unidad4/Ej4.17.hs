import Data.List

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