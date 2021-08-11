numPasosHanoi :: Integer -> Integer
numPasosHanoi 1     = 1
numPasosHanoi (n+1) = 1 + 2 * numPasosHanoi n