distanciaC :: Eq a => [a] -> [a] -> Int
distanciaC xs ys = length [(x,y) | (x,y) <- zip xs ys, x /= y]
distanciaR :: Eq a => [a] -> [a] -> Int
distanciaR [] ys = 0
distanciaR xs [] = 0
distanciaR (x:xs)(y:ys) | x /= y = 1 + distanciaR xs ys
                        | otherwise = distanciaR xs ys