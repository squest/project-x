(ns project-x.core
  (:gen-class))

(defn -main
  []
  (println "Hello, World!"))

(defn square [x] 
  (* x x))

(defn abc [a b c] 
  (let [disc (Math/sqrt (- (square b) (* 4 a c)))]
    [(/ (+ (- b) disc ) (* 2 a)) (/ (- (- b) disc) (* 2 a))])) 

(defn sambut [nama] 
  (str "Hello, " nama "!" ))

(defn faktorial [x]
  (if (> x 1) 
    (* x (faktorial (dec x)))
     1))

(defn sum [lst]
  (if (empty? lst) 0 
    (+ (first lst) (sum (rest lst)))))

(defn product [x]
  (if (empty? x) 
    1
    (* (first x) (product (rest x)))))
    

(defn length [x]
  (if (empty? x) 
    0
    (+ 1 (length (rest x)))))

(defn pangkat [x y] 
  (if (< y 0)
    (/ 1 (* x (pangkat x (dec (- y)))))
    (if (= y 0)
    1
    (* x (pangkat x (dec y))))))

(defn kebalik [ns] 
  (if (empty? ns)
    '()
    (conj (kebalik (butlast ns)) (last ns))))
    
(defn prime? [x]
  (cond (<= x 1) false
    (= x 2) true
    (= x 3) true
    (zero? (rem x 2)) false
    (zero? (rem x 3)) false
    :else true ))

(defn barisprima [x] (filter prime? (range x)))

(def pro-6-1 
    (sum (map #(pangkat % 2) (range 101))))

(def pro-6-2 (pangkat (sum (range 101)) 2))

;(defn pro-3 [x y] 
 ;   (if (= 1 (/ x (first y))) 
  ;    (first y)
   ;   (pro-3 
    

(defn prime? [x]
  (cond (=< x 1) false
    (= x 2) true
    :else )))
(fn [x y] 
  (if (contains? x y)
  (= nil (x y))
  true)

  

  
  
  
  
