traspuesta :: [[a]] -> [[a]]
traspuesta [] = []
traspuesta ([]:xss) = traspuesta xss
traspuesta ((x:xs):xss) = (x:[h | (h:_) <- xss]) : traspuesta (xs : [t | (_:t) <- xss])