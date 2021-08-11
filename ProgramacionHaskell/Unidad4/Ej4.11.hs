enRangoC :: Int -> Int -> [Int] -> [Int]
enRangoC a b xs = [x | x <- xs, a <= x, x <=b]
enRangoR :: Int -> Int -> [Int] -> [Int]
enRangoR a b [] = []
enRangoR a b (x:xs)
    | a <= x && x <= b = x : enRangoR a b xs
    | otherwise        = enRangoR a b xs 