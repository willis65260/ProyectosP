tabla x y
    | x == 'T' && y == 'T' = 'T'
    | x == 'T' && y == 'F' = 'T'
    | x == 'F' && y == 'T' = 'T'
    | x == 'F' && y == 'F' = 'F'

xor2 True y = not y
xor2 False y = y

xor3 x y = (x || y) && not (x && y)

xor4 x y = x /= y