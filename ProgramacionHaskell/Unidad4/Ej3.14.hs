mezcla :: Ord a => [a] -> [a] -> [a]
mezcla [] ys = ys
mezcla xs [] = xs
mezcla (x:xs) (y:ys) | x <= y = x : mezcla xs (y:ys)
                     | otherwise = y : mezcla (x:xs) ys


mitades :: [a] -> ([a],[a])
mitades xs = splitAt (length xs `div` 2) xs



ordMezcla :: Ord a => [a] -> [a]
ordMezcla [] = []
ordMezcla [x] = [x]
ordMezcla xs = mezcla (ordMezcla ys) (ordMezcla zs)
                where (ys,zs) = mitades xs


ordenada :: Ord a => [a] -> Bool
ordenada [] = True
ordenada [_] = True
ordenada (x:y:xs) = x <= y && ordenada (y:xs)


prop_ordMezcla_ordenada :: Ord a => [a] -> Bool
prop_ordMezcla_ordenada xs = ordenada (ordMezcla xs)


borra :: Eq a => a -> [a] -> [a]
borra x [] = []
borra x (y:ys) | x == y = ys
               | otherwise = y : borra x ys


esPermutacion :: Eq a => [a] -> [a] -> Bool
esPermutacion [] [] = True
esPermutacion [] (y:ys) = False
esPermutacion (x:xs) ys = elem x ys && esPermutacion xs (borra x ys)


prop_ordMezcla_pemutacion :: Ord a => [a] -> Bool
prop_ordMezcla_pemutacion xs = esPermutacion (ordMezcla xs) xs


