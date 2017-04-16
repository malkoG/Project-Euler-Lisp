(defn- fifth-power [n]
  (reduce * (take 5 (repeat n))))

(defn- digits [n]
  (->> n
       (str)
       (char-array)
       (map str)
       (map read-string)))

(defn- sum-of-fifth-power [n]
  (->> n
       (digits)
       (map fifth-power)
       (reduce +')))

(defn- filter-function [n]
  (= n (sum-of-fifth-power n)))

(defn- calculated-range [n]
  (map (partial + 2) (range n)))

(defn result [n]
  (reduce +' (filter filter-function (calculated-range n))))

(println (result 355000))
