sumaPositivosC :: [Int] -> Int
sumaPositivosC xs = sum [x | x <- xs, x > 0]
sumaPositivosR :: [Int] -> Int 
sumaPositivosR [] = 0
sumaPositivosR (x:xs) | x>0       = x + sumaPositivosR xs 
                      | otherwise = sumaPositivosR xs