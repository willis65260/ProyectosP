agarradoC :: [Float] -> Float
agarradoC ps = sum [p * 0.9 | p <- ps, p * 0.9 <= 199]
agarradoR :: [Float] -> Float
agarradoR [] = 0
agarradoR (p:ps)
    | precioConDescuento <= 199 = precioConDescuento + agarradoR ps
    | otherwise                 = agarradoR ps
    where precioConDescuento = p * 0.9
prop_agarrado :: [Float] -> Bool
prop_agarrado xs = abs (agarradoR xs - agarradoC xs) <= 0.1