aproximaPiC n = sqrt(6*sum [1/x^2 | x <- [1..n]])
aproximaPiR n = sqrt(6*aproximaPiR' n)
aproximaPiR' 1 = 1
aproximaPiR' n = 1/n^2 + aproximaPiR' (n-1)