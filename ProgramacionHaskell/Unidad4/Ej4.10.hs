mitadParesC :: [Int] -> [Int]
mitadParesC xs = [x `div` 2 | x <- xs, x `mod` 2 ==0]
mitadParesR :: [Int] -> [Int]
mitadParesR [] = []
mitadParesR (x:xs)
    | even x = x `div` 2 : mitadParesR xs
    | otherwise = mitadParesR xs