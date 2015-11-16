(ns project-x.keren
  (:require [clojure.string :as cs]))

(def fibo (lazy-cat [1 1] (map + fibo (rest fibo))))
 