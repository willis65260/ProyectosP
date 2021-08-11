sustituyeImpar :: [Int] -> [Int]
sustituyeImpar [] = []
sustituyeImpar (x:xs) | odd x     = (x+1): sustituyeImpar xs
                      | otherwise = x:sustituyeImpar xs