imparesC :: [Integer] -> [Integer]
imparesC xs = [x | x <- xs, odd x]
imparesR :: [Integer] -> [Integer]
imparesR [] = []
imparesR (x:xs) | odd x = x : imparesR xs
                | otherwise = imparesR xs 