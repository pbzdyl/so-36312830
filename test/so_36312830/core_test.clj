(ns so-36312830.core-test
  (:require [clojure.test :refer :all]
            [so-36312830.core :refer :all]))

(extend-protocol IPrintable
  clojure.lang.Associative
  (prnt [this] (str "My custom impl for clojure.lang.Associative " this)))

(deftest override-extend-protocol
  (println (prnt {:a 1}))
  (is (= "My custom impl for clojure.lang.Associative {:a 1}" (prnt {:a 1}))))
