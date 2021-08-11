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