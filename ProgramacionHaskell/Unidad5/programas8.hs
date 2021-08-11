-- import Test.QuickCheck
import Data.Char
import Data.List


--ejercicio 8.1
type Punto = (Double,Double)
cercanos :: [Punto] -> [Punto] -> (Punto,Punto)
cercanos ps qs = (p,q) where (d,p,q) = minimum [(distancia p q, p, q) | p <- ps, q <- qs] 
distancia (x,y) (u,v) = sqrt ((x-u)^2+(y-v)^2)

--ejercicio 8.2
data Nat = Cero | Suc Nat deriving (Eq, Show)
suma :: Nat -> Nat -> Nat
suma Cero n = n
suma (Suc m) n = Suc (suma m n)

producto :: Nat -> Nat -> Nat
producto Cero _ = Cero
producto (Suc m) n = suma n (producto m n)

-- ejercicio 8.3
data Arbol = Hoja Int | Nodo Arbol Int Arbol deriving (Show, Eq)
ejArbol :: Arbol
ejArbol = Nodo (Nodo (Hoja 1) 3 (Hoja 4)) 5 (Nodo (Hoja 6) 7 (Hoja 9))

ocurre :: Int -> Arbol -> Bool
ocurre m (Hoja n) = m == n
ocurre m (Nodo i n d) = m == n || ocurre m i || ocurre m d

-- data Ordering = LT | EQ | GT
-- compare :: Ord a => a -> a -> Ordering
-- ocurre' :: Int -> Arbol -> Bool
-- ocurre' m (Hoja n) = m == n
-- ocurre' m (Nodo i n d) = case compare m n of( LT -> ocurre' m i | EQ -> True | GT -> ocurre' m d)

--ejercicio 8.4
data ArbolB = HojaB Int | NodoB ArbolB ArbolB deriving Show
ejArbolB :: ArbolB
ejArbolB = NodoB (NodoB (HojaB 1) (HojaB 4)) (NodoB (HojaB 6) (HojaB 9))
-- nHojas :: ArbolB -> Int
balanceado :: ArbolB -> Bool
balanceado (HojaB _) = True
-- balanceado (NodoB a1 a2) = abs (nHojas a1 - nHojas a2) <= 1 && balanceado a1 && balanceado a2

mitades :: [a] -> ([a],[a])
mitades xs = splitAt (length xs `div` 2) xs
arbolBalanceado :: [Int] -> ArbolB
arbolBalanceado [x] = HojaB x
arbolBalanceado xs = NodoB (arbolBalanceado ys) (arbolBalanceado zs) where (ys,zs) = mitades xs
--ejercicio 8.5

data Arbol1 a = Hoja1 | Nodo1 a (Arbol1 a) (Arbol1 a) deriving (Show, Eq)

nHojas :: Arbol1 a -> Int
nHojas Hoja1 = 1
nHojas (Nodo1 x i d) = nHojas i + nHojas d

nNodos :: Arbol1 a -> Int
nNodos Hoja1 = 0
nNodos (Nodo1 x i d) = 1 + nNodos i + nNodos d

profundidad :: Arbol1 a -> Int
profundidad Hoja1 = 0
profundidad (Nodo1 x i d) = 1 + max (profundidad i) (profundidad d)

preorden :: Arbol1 a -> [a]
preorden Hoja1 = []
preorden (Nodo1 x i d) = x : (preorden i ++ preorden d)

postorden :: Arbol1 a -> [a]
postorden Hoja1 = []
postorden (Nodo1 x i d) = postorden i ++ postorden d ++ [x]

preordenIt :: Arbol1 a -> [a]
preordenIt x = preordenItAux x [] where preordenItAux Hoja1 xs = xs
preordenItAux (Nodo1 x i d) xs = x : preordenItAux i (preordenItAux d xs)

espejo :: Arbol1 a -> Arbol1 a
espejo Hoja1 = Hoja1
espejo (Nodo1 x i d) = Nodo1 x (espejo d) (espejo i)

takeArbol :: Int -> Arbol1 a -> Arbol1 a
takeArbol 0 _ = Hoja1
takeArbol _ Hoja1 = Hoja1
takeArbol n (Nodo1 x i d) = Nodo1 x (takeArbol (n-1) i) (takeArbol (n-1) d)

repeatArbol :: a -> Arbol1 a
repeatArbol x = Nodo1 x t t where t = repeatArbol x

replicateArbol :: Int -> a -> Arbol1 a
replicateArbol n = takeArbol n . repeatArbol

ramaIzquierda :: Arbol1 a -> [a]
ramaIzquierda Hoja1 = []
ramaIzquierda (Nodo1 x i d) = x : ramaIzquierda i

--ejercicio 8.6
-- data Prop = Const Bool | Var Char | Neg Prop | Conj Prop Prop | Impl Prop Prop deriving Show

-- p1, p2, p3, p4 :: Prop
-- p1 = Conj (Var 'A') (Neg (Var 'A'))
-- p2 = Impl (Conj (Var 'A') (Var 'B')) (Var 'A')
-- p3 = Impl (Var 'A') (Conj (Var 'A') (Var 'B'))
-- p4 = Impl (Conj (Var 'A') (Impl (Var 'A') (Var 'B'))) (Var 'B')

-- data Interpretacion = Asoc Char Bool
-- valor :: Interpretacion -> Prop -> Bool
-- valor _ (Const b) = b
-- valor i (Var x) = busca x i
-- valor i (Neg p) = not (valor i p)
-- valor i (Conj p q) = valor i p && valor i q
-- valor i (Impl p q) = valor i p <= valor i q

-- busca :: Eq c => c -> [(c,v)] -> v
-- busca c t = head [v | (c',v) <- t, c == c']

-- variables :: Prop -> [Char]
-- variables (Const _) = []
-- variables (Var x) = [x]
-- variables (Neg p) = variables p
-- variables (Conj p q) = variables p ++ variables q
-- variables (Impl p q) = variables p ++ variables q

-- interpretacionesVar :: Int -> [[Bool]]
-- interpretacionesVar 0 = [[]]
-- -- interpretacionesVar (n+1) = map (False:) bss ++ map (True:) bss where bss = interpretacionesVar n

-- interpretaciones :: Prop -> [Interpretacion]
-- interpretaciones p = map (zip vs) (interpretacionesVar (length vs)) where vs = nub (variables p)

-- interpretaciones' :: Prop -> [Interpretacion]
-- interpretaciones' p =[zip vs i | i <- is] where vs = nub (variables p)
-- is = (interpretacionesVar (length vs))

-- esTautologia :: Prop -> Bool
-- esTautologia p = and [valor i p | i <- interpretaciones p]

-- data FProp =  FProp | Disj FProp FProp | Equi FProp FProp deriving Show
-- -- type Interpretacion = [(Char, Bool)]
-- valor1 :: Interpretacion -> FProp -> Bool
-- valor1 _ (Const b) = b
-- valor1 i (Var x) = busca1 x i
-- valor1 i (Neg p) = not (valor i p)
-- valor1 i (Conj p q) = valor i p && valor i q
-- valor1 i (Disj p q) = valor i p || valor i q -- Añadido
-- valor1 i (Impl p q) = valor i p <= valor i q
-- valor1 i (Equi p q) = valor i p == valor i q -- Añadido
-- busca1 :: Eq c => c -> [(c,v)] -> v
-- busca1 c t = head [v | (c',v) <- t, c == c']
-- variables1 :: FProp -> [Char]
-- variables1 (Const _) = []
-- variables1 (Var x) = [x]
-- variables1 (Neg p) = variables p
-- variables1 (Conj p q) = variables p ++ variables q
-- variables1 (Disj p q) = variables p ++ variables q -- Añadido
-- variables1 (Impl p q) = variables p ++ variables q
-- variables1 (Equi p q) = variables p ++ variables q -- Añadido

-- interpretacionesVar1 :: Int -> [[Bool]]
-- interpretacionesVar1 0 = [[]]
-- -- interpretacionesVar (n+1) = map (False:) bss ++ map (True:) bss where bss = interpretacionesVar n
-- interpretaciones1 :: FProp -> [Interpretacion]
-- interpretaciones1 p = map (zip vs) (interpretacionesVar1 (length vs)) where vs = nub (variables1 p)
-- esTautologia1 :: FProp -> Bool
-- esTautologia1 p = and [valor i p | i <- interpretaciones1 p]

-- interpretacionesVar' :: Int -> [[Bool]]
-- interpretacionesVar' 0 = [[]]
-- interpretacionesVar' (n+1) = [False:bs | bs <- bss] ++ [True:bs | bs <- bss] where bss = interpretacionesVar' n
-- interpretaciones' :: FProp -> [Interpretacion]
-- interpretaciones' p = [zip vs i | i <- is] where vs = nub (variables p)
-- is = interpretacionesVar (length vs)

--ejercicio 8.7
data Palo = Picas | Corazones | Diamantes | Treboles deriving (Eq, Show)

data Color = Rojo | Negro deriving Show

color :: Palo -> Color
color Picas = Negro
color Corazones = Rojo
color Diamantes = Rojo
color Treboles = Negro

data Valor = Numerico Int | Sota | Reina | Rey | As deriving (Eq, Show)

mayor :: Valor -> Valor -> Bool
mayor _ As = False
mayor As _ = True
mayor _ Rey = False
mayor Rey _ = True
mayor _ Reina = False
mayor Reina _ = True
mayor _ Sota = False
mayor Sota _ = True
mayor (Numerico m) (Numerico n) = m > n

prop_MayorValor1 a b = mayor a b || mayor b a

data Carta = Carta Valor Palo deriving (Eq, Show)

valor :: Carta -> Valor
valor (Carta v p) = v

palo :: Carta -> Palo
palo (Carta v p) = p

ganaCarta :: Palo -> Carta -> Carta -> Bool
ganaCarta triunfo c c' | palo c == palo c' = mayor (valor c) (valor c') | palo c == triunfo = True | otherwise = False

prop_GanaCarta t c1 c2 = ganaCarta t c1 c2 || ganaCarta t c2 c1

data Mano = Vacia | Agrega Carta Mano deriving (Eq, Show)

ganaMano :: Palo -> Mano -> Carta -> Bool
ganaMano triunfo Vacia c' = False
ganaMano triunfo (Agrega c m) c' = ganaCarta triunfo c c' || ganaMano triunfo m c'

eligeCarta :: Palo -> Carta -> Mano -> Carta
eligeCarta triunfo c1 (Agrega c Vacia) = c -- 1
eligeCarta triunfo c1 (Agrega c resto) | palo c == palo c1 && palo c' /= palo c1 = c | palo c /= palo c1 && palo c' == palo c1 = c' | ganaCarta triunfo c c1 && not (ganaCarta triunfo c' c1) = c | ganaCarta triunfo c' c1 && not (ganaCarta triunfo c c1) = c' | mayor (valor c) (valor c') = c' | otherwise = c where c' = eligeCarta triunfo c1 resto


-- prop_MayorValor a b =
-- a /= b ==> mayor a b || mayor b a


-- instance Arbitrary Valor where
-- arbitrary = oneof $ [ do return c | c <- [Sota,Reina,Rey,As] ] ++ [ do n <- choose (2,10) return (Numerico n) ]

-- instance Arbitrary Palo where arbitrary = elements [Picas, Corazones, Diamantes, Treboles]

--ejercicio 8.8
data Expr = N Int | V Char | S Expr Expr | P Expr Expr deriving Show
valor2 :: Expr -> [(Char,Int)] -> Int
valor2 (N x) e = x
valor2 (V x) e = head [y | (z,y) <- e, z == x]
valor2 (S x y) e = (valor2 x e) + (valor2 y e)
valor2 (P x y) e = (valor2 x e) * (valor2 y e)

--ejercicio 8.9
data Expr1 = Num Int | Suma Expr1 Expr1 | X
numVars1 :: Expr1 -> Int
numVars1 (Num n) = 0
numVars1 (Suma a b) = numVars1 a + numVars1 b
numVars1 X = 1


--ejercicio 8.10
sustitucion :: Expr -> [(Char, Int)] -> Expr
sustitucion e [] = e
sustitucion (V c) ((d,n):ps) | c == d = N n | otherwise = sustitucion (V c) ps
sustitucion (N n) _ = N n
sustitucion (S e1 e2) ps = S (sustitucion e1 ps) (sustitucion e2 ps)
sustitucion (P e1 e2) ps = P (sustitucion e1 ps) (sustitucion e2 ps)