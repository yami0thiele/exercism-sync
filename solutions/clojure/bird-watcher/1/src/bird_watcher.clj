(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (peek birds))

(comment
  (today [0 2 5 3 7 8 4]))

(defn inc-bird [birds]
  (conj (pop birds) (inc (today birds))))

(comment
  (inc-bird [0 2 5 3 7 8 4]))

(defn day-without-birds? [birds]
  (not (nil? (some zero? birds))))

(comment
  (day-without-birds? [0 2 5 3 7 8 4])
  (day-without-birds? [1 2 5 3 7 8 4]))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(comment
  (n-days-count [2 5 0 7 4 1] 4))

(defn busy-days [birds]
  (count (filter (fn [x] (>= x 5)) birds)))

(comment
  (busy-days [0 2 5 3 7 8 4]))

(defn odd-week? [birds]
  (and
   (every? (fn [x] (= x 1)) (keep-indexed (fn [idx val] (when (even? idx) val)) birds))
   (every? (fn [x] (= x 0)) (keep-indexed (fn [idx val] (when (odd? idx) val)) birds))))

(comment
  (odd-week? [1 0 1 0 1 0 1])
  (odd-week? [1 1 1 0 1 0 1])
  (odd-week? [1 0 0 0 1 0 1])
  (odd-week? [2 0 1 0 1 0 1]))
