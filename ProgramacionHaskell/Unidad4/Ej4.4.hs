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