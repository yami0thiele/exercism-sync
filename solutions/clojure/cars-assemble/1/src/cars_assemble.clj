(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (= speed 0) (double 0)
        (<= speed 4) (double (/ (* speed 221 100) 100))
        (<= speed 8) (double (/ (* speed 221 90) 100))
        (<= speed 9) (double (/ (* speed 221 80) 100))
        (<= speed 10) (double (/ (* speed 221 77) 100))))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))
