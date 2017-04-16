(defn- sum-of-square [x]
  (->> (range x)
       (map inc)
       (map #(* % %))
       (reduce +')))

(defn- square-of-sum [x]
  (->> (range x)
       (map inc)
       (reduce +')
       (#(* % %))))

(defn result [x]
  (- (square-of-sum x) (sum-of-square x)))

(println (result 100))
       
