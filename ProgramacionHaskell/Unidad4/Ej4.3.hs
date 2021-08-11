sumaCuadradosImparesR :: Integer -> Integer
sumaCuadradosImparesR 1 = 1
sumaCuadradosImparesR n 
    |odd n = n^2 + sumaCuadradosImparesR (n-1)
    | otherwise = sumaCuadradosImparesR (n-1)
sumaCuadradosImparesC :: Integer -> Integer
sumaCuadradosImparesC n = sum [x^2 | x<- [1..n], odd x]
sumaCuadradosImparesC' :: Integer -> Integer
sumaCuadradosImparesC' n = sum[x^2 | x<-[1,3..n]]