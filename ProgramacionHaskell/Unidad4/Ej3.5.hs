menorDivisible :: Integer -> Integer -> Integer
menorDivisible a b
    | a == b = a
    | otherwise = lcm a (menorDivisible (a+1) b)

euler5 :: Integer
euler5 = menorDivisible 1 20