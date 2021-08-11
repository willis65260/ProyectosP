rota1 xs = tail xs ++ [head xs]
rota n xs = drop n xs ++ take n xs
