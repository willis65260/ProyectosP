mediano x y z = x + y + z- minimum [x,y,z] - maximum [x,y,z]
mediano1 x y z
    | a <= x && x <= b = x
    | a <= y && y <= b = y
    | otherwise        = z
    where a = minimum [x,y,z]
          b = maximum [x,y,z]