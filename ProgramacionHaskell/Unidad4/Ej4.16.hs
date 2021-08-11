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
factorizacion :: Integer -> [(Integer,Integer)]
factorizacion n = [(x,mayorExponenteR x n) | x <- factoresPrimos n]
expansionR :: [(Integer,Integer)] -> Integer
expansionR [] = 1
expansionR ((x,y):zs) = x^y * expansionR zs
expansionC :: [(Integer,Integer)] -> Integer
expansionC xs = product [x^y | (x,y) <- xs]
prop_factorizacion n = and [expansionC (factorizacion x) == x | x <- [1..n]]