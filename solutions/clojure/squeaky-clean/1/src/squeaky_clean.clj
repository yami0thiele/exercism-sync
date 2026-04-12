(ns squeaky-clean
  (:require [clojure.string :as str]))

(defn kebab-to-camel 
  [s]
  (str/replace s #"-(.)" (fn [[_ c]] (str/upper-case c))))

(comment
  (kebab-to-camel "") ; 
  (kebab-to-camel "foo-bar-baz") ; fooBarBaz
  )

(defn clean
  [s]
  (->> s
       (#(str/replace % " " "_"))
       (#(str/replace % #"\p{Cc}" "CTRL"))
       (kebab-to-camel)
       (#(str/replace % #"[^\p{L}_]" ""))
       (#(str/replace % #"[α-ω]" ""))))
