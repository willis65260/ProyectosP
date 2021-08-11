imparesCuadradosC :: [Integer] -> [Integer]
imparesCuadradosC xs = [x*x | x <- xs, odd x]
imparesCuadradosR :: [Integer] -> [Integer]
imparesCuadradosR [] = []
imparesCuadradosR (x:xs) | odd x =x*x : imparesCuadradosR xs
                         | otherwise = imparesCuadradosR xs