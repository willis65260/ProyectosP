sumas :: Int -> [Int] -> [Int]
sumas 0 _ = [0]
sumas _ [] = [0]
sumas n (x:xs) = [x+y | y <- sumas (n-1) (x:xs)]++ sumas n xs