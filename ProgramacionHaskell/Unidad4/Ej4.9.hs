entreL :: Integer -> Integer -> [Integer]
entreL m n = [m..n]
entreR :: Integer -> Integer -> [Integer]
entreR m n | m > n = []
           | otherwise = m : entreR (m+1) n