formaReducida (a,b) = (a `div`  c, b `div`  c)
    where c = gcd a b
suma (a,b) (c,d) = formaReducida (a*d+b*c, b*d)
producto (a,b) (c,d) = formaReducida (a*c, b*d)
igualdad (a,b) (c,d) = 
    formaReducida (a,b) == formaReducida (c,d)