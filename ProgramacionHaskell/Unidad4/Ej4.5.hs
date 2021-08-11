cuadradosC :: [Integer] -> [Integer]
cuadradosC xs = [x*x | x <- xs]
cuadradosR :: [Integer] -> [Integer]
cuadradosR [] = []
cuadradosR (x:xs) = x*x : cuadradosR xs