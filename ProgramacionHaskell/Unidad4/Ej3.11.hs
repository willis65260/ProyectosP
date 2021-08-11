selecciona :: [a] -> Int -> a
selecciona (x:_) 0 = x
selecciona (_:xs) n = selecciona xs (n-1)