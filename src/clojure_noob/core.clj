(ns clojure-noob.core
  (:gen-class))


(defn add
  [x y]
  (+ x y))

(defn recursive-printer
  ([]
     (recursive-printer 0))
  ([iteration]
     (if (> iteration 3)
       (println "Goodbye!")
       (do (println (str "Iteration:" iteration))
           (recursive-printer (inc iteration))))))

(defn dec-maker
  [x]
  (fn [y] (- y x)))

(defn mapset
  [f l]
  (set (map f l)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (add 2 45)))

(defn toss
  "Returns a heads or tails"
  []
  (if (> (rand) 0.5)
    "Heads!"
    "Tails!"))


(defn prob 
  [n] 
  (/ (count (filter #(= % "Heads!") (take n (repeatedly toss)))) (float n)))

(defn factorial
  ([n]
   (factorial n 1))
  ([n acc]
   (if (= n 0) 
     acc
     (recur (- n 1) (* n acc)))))
  
(defn factorial-fun
  [n]
  (reduce * 1 (range 1 (+ n 1))))
