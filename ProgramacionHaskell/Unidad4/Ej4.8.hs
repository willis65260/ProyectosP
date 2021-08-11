sumaCuadradosImparesC :: [Integer] -> Integer
sumaCuadradosImparesC xs = sum [x*x | x <- xs,odd x]
sumaCuadradosImparesR :: [Integer] -> Integer
sumaCuadradosImparesR [] = 0
sumaCuadradosImparesR (x:xs)
    | odd x     = x*x + sumaCuadradosImparesR xs
    | otherwise = sumaCuadradosImparesR xs