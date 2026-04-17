(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (let [[a] deck]
    a))

(defn second-card
  "Returns the second card from deck."
  [deck]
  (let [[_ a] deck]
    a))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[a b & more] deck]
    (into [b a] more)))

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [deck]
  (let [[x & xs] deck]
    [x xs]))

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (let [[x & xs] deck]
    (into [] (comp cat (remove nil?)) [[x] face-cards xs])))

(comment
  (first-card [1 2 3])
  (second-card [1 2 3])
  (swap-top-two-cards [1 2 3 4])
  (discard-top-card [1 2 3])
  (insert-face-cards [1 2 3 4])
  (insert-face-cards [])
  )
