raices_1 a b  c = [(-b+d)/t,(-b-d)/t]
    where d = sqrt (b^2 - 4*a*c)
          t = 2*a
raices_2 a b c 
    | d >= 0 = [(-b+e)/(2*a), (-b-e)/(2*a)]
    | otherwise = error "No tiene raices reales"
    where d = b^2-4*a*c
          e = sqrt d 