numeroBloquesR :: Integer -> Integer
numeroBloquesR 0 = 0
numeroBloquesR n = 2*n + numeroBloquesR (n-1)
numeroBloquesC :: Integer -> Integer
numeroBloquesC n = sum [2*x | x <- [1..n]]